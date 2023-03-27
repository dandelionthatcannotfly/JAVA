/*2023.3.18 JAVA 简易计算器
* 孙婕
* 4211169063*/
import java.util.Scanner;
public class calculator {
    //定义加法
    public static double sum(double n,double m){
        double sum=n+m;
        return sum;
    }
    //定义减法
    public static double minus(double n,double m){
        double minus=n-m;
        return minus;
    }
    //定义乘法
    public static double mal(double n,double m){
        double mal=n*m;
        return mal;
    }
    //定义除法
    public static double div(double n,double m){
        double div=n/m;
        return div;
    }
    public static void main(String args[]){
        System.out.print("请输入您要计算的数字1：");
        Scanner number = new Scanner(System.in);
        double i = number.nextDouble();
        System.out.print("请输入您要计算的计算符：");
        Scanner symbol=new Scanner(System.in);
        String w=symbol.next();
        System.out.print("请输入您要计算的数字2：");
        double j = number.nextDouble();
        switch(w){
            case "+":
                System.out.println(i+"加上"+j+"的结果："+sum(i,j));
                break;
            case "-":
                System.out.println(i+"减去"+j+"的结果："+minus(i,j));
                break;
            case "*":
                System.out.println(i+"乘以"+j+"的结果："+mal(i,j));
                break;
            case "/":
                System.out.println(i+"除以"+j+"的结果："+div(i,j));
                break;
        }
    }
}
