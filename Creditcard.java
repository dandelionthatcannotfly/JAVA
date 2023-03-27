/*2023.3.18 JAVA  设置信用卡密码
* 孙婕
* 4211169063*/
import java.util.Scanner;
public class Creditcard {
    //创建卡号
    public static void Number() {
        Scanner nums = new Scanner(System.in);
        String n = nums.next();
    }
    //若用户设置密码
    public static void Setup(){
        System.out.print("请输入您的初始密码:");
        Scanner password=new Scanner(System.in);
        String m=password.next();
        System.out.print("请再次输入您的密码：");
            String z = password.next();
            if (m.equals(z) == true) {
                System.out.println("设置成功");
            } else {
                System.out.println("两次输入的密码不相同，请重新输入");
                Setup();
            }
        }



    //若用户暂时未设置密码
    public static void Noset(){
        System.out.println("已默认您的初始密码为“123456”");
    }
    public static void main(String[] args){
        Creditcard crd=new Creditcard();
        //输入并创建卡号
        System.out.print("请输入您的账号：");
        crd.Number();

        System.out.println("设置初密码请按O，暂不设置请按F，初次登录您的密码为“123456”");
        Scanner pushbutton=new Scanner(System.in);
        String w=pushbutton.next();
        switch(w){
            case "O":
                crd.Setup();
                break;
            case "F":
                Noset();
        }
    }
}
