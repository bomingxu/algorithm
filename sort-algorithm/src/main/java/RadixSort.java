/**
 * @author xuboming
 * @date 2022/2/20 9:27 下午
 */
public class RadixSort {


    public static void main(String[] args) {
        int[] arr = {1023,511,822,711,9073};
        int maxlength = String.valueOf(arr[0]).length();
        for(int i=1;i<arr.length;i++){
            if(String.valueOf(arr[i]).length()>maxlength){
                maxlength = String.valueOf(arr[i]).length();
            }
        }
        int[] result = sort(arr,maxlength);
        print(result);
    }

    private static int[] sort(int[] arr,int maxlength) {


        int[] result = new int[arr.length];
        for(int i=0;i<maxlength;i++){
            int[] count = new int[10];
            int division = (int) Math.pow(10, i);
            for(int j=0;j<arr.length;j++){
                int num = arr[j]/division%10;
                count[num]++;
            }
            print(count);
            //count 数组累加
            for(int j=1;j<count.length;j++){
                count[j] = count[j-1] + count[j];
            }
            print(count);
            //
            for(int j=arr.length-1;j>=0;j--){
                int tempt = arr[j]/division%10;
                result[--count[tempt]] = arr[j];
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

}
