import java.util.Arrays;
import java.util.Random;

/**
 * @author xuboming
 * @date 2022/2/16 16:25
 */
public class DataChecker {

    //创建一个随机数数组
    public static int[] getArray(){
        Random random = new Random();
        int[] result = new int[10000];
        for(int i = 0;i<result.length;i++){
            result[i] = random.nextInt(10000);
        }
        return result;
    }

    public static String check(){
        boolean hasSame = true;
        for(int j=0;j<1000;j++){
            int[] arr = getArray();
            int[] arr2 = new int[arr.length];
            System.arraycopy(arr,0,arr2,0,arr.length);
            SelectionSort.primarySelectionSort(arr);
            Arrays.sort(arr2);

            for(int i=0;i<arr.length;i++){
                if(arr[i] != arr2[i]){
                    hasSame = false;
                    return "false";
                }
            }
        }
        return hasSame?"success":"false";
    }

    public static void main(String[] args) {
        System.out.println(check());
    }
}
