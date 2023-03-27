/*2023.3.27 JAVA 判断3条给定长度的边能否构成三角形
*4211169063
*孙婕*/

//抽象的图形类
abstract class figures{
    abstract void getPerimeter();
}
//三角形类，继承图形类
class triangles extends figures{
    //定义三角形的三条边
    double n;
    double m;
    double j;
    public void triangles(double one,double two,double three){
        this.n=one;
        this.m=two;
        this.j=three;
        if(n+m>j&&m+j>n&&n+j>m){
            System.out.print("长为"+n+"、"+m+"、"+j+"的3条边能构成三角形");
        }else{
            System.out.print("长为"+n+"、"+m+"、"+j+"的3条边不能构成三角形，因为三角形两边之和必须大于第三边");
        }
    }
    public void getPerimeter(){
        //计算三角形的边长
        double getPerimeter=n+m+j;
        System.out.println("这个三角形的周长为"+getPerimeter);
    }
}
public class triangle {
    public static void main(String[] args){
        triangles t=new triangles();
        t.triangles(3.0,4.0,5.0);
        t.getPerimeter();
        t.triangles(1.0,4.0,5.0);
    }
}
