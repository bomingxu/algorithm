/**
 * @author xuboming
 * @date 2022/2/17 12:33
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {9,7,2,6,8,4,3,1,5};
        insertionSort(arr);
        print(arr);
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(j,j-1,arr);
                }else{
                    break;
                }
            }
        }
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
