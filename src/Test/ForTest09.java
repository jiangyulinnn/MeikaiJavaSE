package Test;

/**
 * TODO
 * 编写for循环找出1-100中所有的素数
 * @Author: yulin
 * @Date: 2020/2/15 2:19 PM
 */
public class ForTest09 {
    public static void main(String[] args) {

        //现编写程序验证7这个数是不是素数
        int count = 0;
        for(int i=2;i<=100;i++){

            boolean isSuShu = true; //默认将i看作一个素数【标记在开发中比较常用】
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSuShu = false;
                    break;
                }
            }
            if(isSuShu){
            count++;
            System.out.print(isSuShu?i+"是素数":i+"不是素数");
            if(count % 8 == 0){
                System.out.println();
            }
            }
        }


    }
}
