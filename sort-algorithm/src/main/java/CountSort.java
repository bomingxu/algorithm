/**
 * @author xuboming
 * @date 2022/2/20 2:35 下午
 */
public class CountSort {

    public static void main(String[] args) {
        int[] arr = {5,8,7,6,3,4,1,0,8,4,6,9,7,4,2,5};
        int[] result = sort(arr);
        print(result);
    }

    public static int[] sort(int[] arr){
        int[] result = new int[arr.length];
        //arr中的值最小为0，最大为9
        int[] count = new int[10];
        for(int i=0;i<result.length;i++){
            count[arr[i]]++;
        }
        //对count 数组进行从1位置的累加
        for (int i=1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }
        //  倒叙遍历arr数组，对result进行赋值,累加后的count中的值-1为其index的值在result数组中最后的位置
        for(int i=arr.length-1;i>=0;i--){
            result[--count[arr[i]]] = arr[i];
        }
        return result;
    }

    public static void print(int[] bytes){
        for(int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
    }

}
