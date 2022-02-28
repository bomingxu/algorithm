/**
 * @author xuboming
 * @date 2022/2/28 10:07 下午
 */
public class RandToRand {

    // 等概率返回1~5
    public static int f(){
        int ans = 0;
        //Math.random * 5 +1 ->[0,1)*5 +1=[1,6) = [1,5]
        ans = (int) (Math.random()*5+1);
        return ans;
    }

    // 随机机制，只能用f1，等概率返回0和1
    public static int f2(){
        int ans = 0;
        do{
            ans = f();
        }while (ans == 3);
        return ans > 3 ? 1:0;
    }
    // 得到000 ~ 111 做到等概率 0 ~ 7等概率返回
    public static int f3(){
        // f2()*2*2 + f2()*2 + f2()
        return (f2()<<2)+(f2()<<1)+f2();
    }

    // 0 ~ 6等概率返回一个
    public static int f4(){
        int ans = 0;
        do{
            ans = f3();
        }while (ans==7);
        return ans;
    }

    //等概率返回 1～7
    public static int f5(){
        return f4()+1;
    }

    // 你只能知道，x会以固定概率返回0和1，但是x的内容，你看不到！
    public static int x(){
        return Math.random()<0.84?0:1;
    }

    //只能用x 等概率返回0 或 1
    public static int y(){
        int ans = 0;
        do{
            ans = x();
        }while(ans == x());
        return ans;
    }

}
