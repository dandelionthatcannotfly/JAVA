/*2023.4.4 JAVA 转置字符串*/
import java.util.Scanner;
public class ZhuanziString {
    public static void main(String[] args){
        System.out.println("请输入您想输入的字符：");
        Scanner zifu=new Scanner(System.in);
        String z=zifu.next();
        char[] chr=z.toCharArray();
        System.out.println("转置后的字符为：");
        for(int i=chr.length-1;i>=0;i--){
            System.out.print(chr[i]);
        }
    }
}


