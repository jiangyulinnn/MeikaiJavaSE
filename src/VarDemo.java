import java.util.Scanner;

public class VarDemo {
    public static void main(String[] args) {
        double price = 0.5;
        String name = "小滑头";
        int count = 999;
        Scanner input = new Scanner(System.in);

        System.out.printf("你选择的商品是%s，价格%.2f，剩余库存%d\n",name,price,count);
        System.out.println("请输入你需要购买的数量：");
        int number = input.nextInt();
        System.out.println("剩余库存为"+(count-number));

    }
}