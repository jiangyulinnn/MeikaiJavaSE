import java.util.Scanner;


class ReverseNo{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("逆序显示。");

        int x;
        do {
            System.out.println("正整数：");
            x = stdIn.nextInt();
        }while (x <= 0);    //到此处为止跳出循环肯定为正整数了
        while(x>0) {
            System.out.println(x % 10);
            x/=10;
        }
    }
}