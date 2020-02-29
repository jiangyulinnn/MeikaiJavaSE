import java.util.Scanner;

/**
 * TODO
 *
 * @Author: yulin
 * @Date: 2019/9/18 7:28 PM
 */
public class Circle {
    public double radius;   //圆的半径
    public double perimeter;    //圆的周长
    public double area;     //圆的面积

    public void inputRadius(){
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
