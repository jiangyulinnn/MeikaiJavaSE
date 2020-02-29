import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n,sum = 0,N;    //N变量设置的目的是保存初始输入的n的值，因为在后面n的值会变化。

        System.out.println("计算1到n的和。");
        System.out.println("n的值：");
        N = n = stdIn.nextInt();

        do{
            sum += n;
            n--;
        }while(n >= 0);
        System.out.println("1到"+ N +"的和是"+sum);

    }
}
