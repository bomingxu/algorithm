/**
 * @author xuboming
 * @date 2022/2/17 10:45 下午
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,9,4,2,10,6,20,13,8,11,15,19};
        sort(arr,0,arr.length-1);
        //merge01(arr,0,6,8);
        print(arr);
    }
    //对数组进行屉柜
    public static void sort(int[] arr,int left,int right){
        if(left == right){
            return;
        }
        int mid = left + (right-left)/2;

        sort(arr,left,mid);

        sort(arr,mid+1,right);

        merge01(arr,left,mid+1,right);//0,1,1
    }
    //对数字的某个期间进行合并
    private static void merge01(int[] arr,int leftPos,int rightPos,int rightBound) {
        int mid = rightPos-1;//0
        int[] temp = new int[rightBound-leftPos+1];
        int i = leftPos;//0
        int j = rightPos;//1
        int k = 0;
        while (i<=mid && j<=rightBound){//i<=0,j<=1
            temp[k++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=rightBound){
            temp[k++] = arr[j++];
        }

        for(int m=0;m<temp.length;m++){
            arr[leftPos+m] = temp[m];
        }

//        print(temp);
    }
    /*
    //对一个两段都排好顺序的数组进行合并
    private static void merge01(int[] arr) {
        int mid = 6;
        int[] temp = new int[arr.length];
        int i = 0;
        int j = 6;
        int k = 0;
        while (i<mid && j<arr.length){
            temp[k++] = arr[i]<arr[j]?arr[i++]:arr[j++];
        }
        while(i<mid) temp[k++] = arr[i++];

        while(j<arr.length) temp[k++] = arr[j++];

        print(temp);
    }*/

    public static void print(int[] bytes){
        for(int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int i,int j,int[] bytes){
        int temp = bytes[i];
        bytes[i] = bytes[j];
        bytes[j] = temp;
    }

}
