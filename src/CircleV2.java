import java.util.Scanner;

/**
 * TODO
 *
 * @Author: yulin
 * @Date: 2019/9/18 7:28 PM
 */
public class CircleV2 {
    public double radius;   //圆的半径
    public double perimeter;    //圆的周长
    public double area;     //圆的面积

    /**
     * 无参数传入
     */
    public CircleV2(){
        inputRadius();
    }

    /**
     * 有参数传入
     * @param radius1
     */
    public CircleV2(double radius1){
        if(radius1 > 0){
            radius = radius1;
        }else{
            inputRadius();
        }
    }

    /**
     * 改为private后不允许外部调用咯
     */
    private void inputRadius(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        radius = input.nextDouble();
        input.close();
    }

    public void showPrimiter(){
      if (radius <= 0){
          inputRadius();
      }
      perimeter = 2 * Math.PI * radius;
        System.out.println("周长为" + perimeter);
       // System.out.println("圆的周长是" + 2 * PI * radius);

    }

    public void showArea(){
        if (radius <= 0){
            inputRadius();
        }
        area = radius * radius * Math.PI;
        System.out.println("面积为" + area);


    }
}
