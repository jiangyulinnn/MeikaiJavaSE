
public class CircleV3 {
    private double radius;   //圆的半径
    private double perimeter;    //圆的周长
    private double area;     //圆的面积

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        if (radius <= 0){
            radius = 1;
        }else{
            //朕、寡人
            this.radius = radius;
        }

    }
}
