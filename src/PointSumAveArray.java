import java.util.Scanner;

public class PointSumAveArray {
    public static void main(String[] args) {
        final int NUM = 5;
        int sum = 0;
        int[] tensu = new int [NUM];
        Scanner stdIn = new Scanner(System.in);

        System.out.println("请输入"+NUM+"名学生的分数。");

        for (int i = 1;i <= tensu.length;i++){
            System.out.print(i+"号的分数：");
            tensu[i] =stdIn.nextInt();
            sum+=tensu[i];
        }
        System.out.println();
    }
}
