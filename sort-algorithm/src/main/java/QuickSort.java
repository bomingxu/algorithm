/**
 * @author xuboming
 * @date 2022/2/19 6:52 下午
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7,9,1,5,8,23,6,1,8,23,42,1,2};
        sort(arr,0,arr.length-1);
        print(arr);
    }

    public static void sort(int[] arr,int left,int right) {
        if(left >= right) return ;
        int mid = partation(arr,left,right);
        sort(arr,left,mid-1);
        sort(arr,mid+1,right);
    }

    static int partation(int[] arr,int leftpos,int rightBound){
        int pivot = arr[rightBound];
        int left = leftpos;
        int right = rightBound-1;
        while(left<=right){
            while(left<=right && arr[left]< pivot) left++;
            while(left<=right && arr[right]>pivot) right--;

            if(left <= right){
                swap(left++,right--,arr);
            }
        }
        swap(left,rightBound,arr);
//        System.out.print("-----");
//        print(arr);
//        System.out.println();
        return left;
    }


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
