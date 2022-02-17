/**
 * @author xuboming
 * @date 2022/2/17 13:49
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {9,7,2,6,8,4,3,1,5};
        sort(arr);
        print(arr);
    }

    public static void sort(int[] arr) {

        int h = 1;
        while((3*h+1)<arr.length){
            h = 3*h+1;
        }
        for(int gap = h;gap>=1;gap=(gap-1)/3){
            for(int i=gap;i<arr.length;i++){
                for(int j=i;j>gap-1;j-=gap){
                    if(arr[j]<arr[j-gap]){
                        swap(j,j-gap,arr);
                    }
                }
            }
        }
        /*for(int gap = arr.length/2;gap>=1;gap/=2){
            for(int i=gap;i<arr.length;i++){
                for(int j=i;j>gap-1;j-=gap){
                    if(arr[j]<arr[j-gap]){
                        swap(j,j-gap,arr);
                    }
                }
            }
        }*/
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
