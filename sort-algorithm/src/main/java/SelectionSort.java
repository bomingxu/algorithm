/**
 * @author xuboming
 * @date 2022/2/12 15:03
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] bytes = {7,8,5,1,9,6,3,2,4,98,74,11,13,14};
//        primarySelectionSort(bytes);

        seniorSelectionSort(bytes);

    }

    public static void primarySelectionSort(int[] bytes){
        //1.先选择出最小的
        //1.1  先假设最小的位置minpos=0，然后从位置1开始遍历数据与minpos上的数比较，如果比minpos上的数小就将i赋值给minpos
        /*int minpos = 0;
        for(int i=1;i<bytes.length;i++){
            if(bytes[i]<bytes[minpos]){
                minpos = i;
            }
        }
        System.out.println("最小的数位置为:"+minpos);
        //1.2 将minpos位置的数与0位置上的数互换
        int temp = bytes[minpos];
        bytes[minpos] = bytes[0];
        bytes[0] = temp;

        System.out.println("第一次选择后的数据：");
        for(int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]+" ");
        }*/
        //2.循环遍历数组重复1中的所有步骤
        for(int k=0;k<bytes.length-1;k++){
            int minpos = k;
            for(int i=k+1;i<bytes.length;i++){
                if(bytes[i]<bytes[minpos]){
                    minpos = i;
                }
            }
//            System.out.println("最小的数位置为:"+minpos);
            //1.2 将minpos位置的数与0位置上的数互换
            swap(minpos,k,bytes);

//            System.out.println("第"+(k+1)+"次选择后的数据：");
//            print(bytes);
        }
    }

    public static void seniorSelectionSort(int[] bytes){
        //1.先找出数组中的最大值位置和最小值位置
        //1.1 假设最大值位置和最小值位置都为0
        /*int minpos = 0; int maxpos=0;
        //1.2遍历数组比较数组中所有的其他位置的值，如果比最大值大将i赋值给maxPos，如果比最小值小将i赋值给minPos
        for(int i=1;i<bytes.length;i++){
            if(bytes[i]<bytes[minpos]){
                minpos = i;
            }
            if(bytes[i]>bytes[maxpos]){
                maxpos = i;
            }
        }
        //1.3minPos与0互换，maxPos与bytes.length-1互换
        swap(minpos,0,bytes);
        swap(bytes.length-1,maxpos,bytes);
        //1.4 打印结果
        print(bytes);*/

        //2.循环遍历数组重复1中的所有步骤
        for(int k=0;k<bytes.length/2;k++){
            int minpos = k; int maxpos=bytes.length-(k+1);
            //1.2遍历数组比较数组中所有的其他位置的值，如果比最大值大将i赋值给maxPos，如果比最小值小将i赋值给minPos
            for(int i=k+1;i<bytes.length;i++){
                if(bytes[i]<bytes[minpos]){
                    minpos = i;
                }

                if(i<(bytes.length-(k+1))){
                    if(bytes[i-1]>bytes[maxpos]){
                        maxpos = i-1;
                    }
                }



            }
            //1.3minPos与0互换，maxPos与bytes.length-1互换
//            System.out.println("第"+(k+1)+"次选择出的最小值位置和最大值位置+"+minpos+":"+maxpos);
//            System.out.println("第"+(k+1)+"次选择出的最小值"+minpos+"与"+k+"互换");
            swap(minpos,k,bytes);
            if(maxpos == k){
                maxpos = minpos;
            }
//            print(bytes);
//            System.out.println("第"+(k+1)+"次选择出的最大值"+maxpos+"与"+(bytes.length-(k+1))+"互换");
            swap(bytes.length-(k+1),maxpos,bytes);
            //1.4 打印结果

//            print(bytes);
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
