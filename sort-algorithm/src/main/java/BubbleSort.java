/**
 * @author xuboming
 * @date 2022/2/16 16:58
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9,7,2,6,8,4,3,1,5};
        bubbleSort(arr);
        print(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i= arr.length-1;i>0;i--){

            int result = getMax(arr, i);
            if(result == 0){//如果未进行排序，则排序完成
                return ;
            }

        }
    }

    private static int getMax(int[] arr,int n){
        //是否进行过排序标致
        int result = 0;//未进行排序
        for(int j=0;j<n;j++){
            if(arr[j]>arr[j+1]){
                swap(j,j+1,arr);
                result = 1;//进行排序了
            }
        }
        return result;
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
