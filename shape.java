/*2023.3.27 JAVA 抽象的图形
* 4211169063*/

//抽象的图形类
abstract class figure{
    String color;//图形的颜色
    public void figure(String color){
        this.color=color;
    }
    public figure(){
        color="黄色";
    }
    //抽象的“获得面积”的方法
    abstract void getArea();
}
//长方形类，继承图形类
class oblong extends figure{
    double length=6.0;//长
    double width=2.0;//宽
    public void getArea(){
        //计算面积
        double Area=length*width;
        System.out.println("长为"+length+"、宽为"+width+"的"+color+"长方形的面积是"+Area);
    }
}

public class shape{
    public static void main(String[] args){
        oblong o=new oblong();
        o.getArea();
    }
}
