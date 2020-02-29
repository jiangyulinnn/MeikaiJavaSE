import java.util.Scanner;
//输出小于输入值的所有奇数

public class OddNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数值：");
        int x = stdIn.nextInt();

        for (int i = 1;i < x;i+=2){
            System.out.println(i);
        }
    }
}
