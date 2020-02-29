import java.util.Scanner;

/**
 * TODO 验证输入的身份证是否正确
 * 原理：通过ISO 7064:1983.MOD11-2校验码计算法验证第18位是否正确
 * @Author: yulin
 * @Date: 2019/10/1 12:38 AM
 */

public class id18codeCheck {
    public static void main(String[] args) {

        int T = 0;
        int[] id = new int [20]; //创建一个17大小的数组
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请按序输入您身份证的前17位：");

       // System.out.printf("请您输入第%d位:%n",i+1);

        for (int i = 0; i <= 16; i++)
            id[i] = stdIn.nextInt();

        for (int i = 0; i <= 16; i++)
            System.out.println(id[i]);;

        T=(12-(( id[0] * 7 +
                id[1] * 9 +
                id[2] * 10 +
                id[3] * 5 +
                id[4] * 8 +
                id[5] * 4 +
                id[6] * 2 +
                id[7] * 1 +
                id[8] * 6 +
                id[9] * 3 +
                id[10] * 7 +
                id[11] * 9 +
                id[12] * 10 +
                id[13] * 5 +
                id[14] * 8 +
                id[15] * 4 +
                id[16] * 2  ) % 10 ))%11;



        System.out.println("您身份证号码的最后一位是："+T);

    }


}
