import java.awt.*;
import javax.swing.*;
//import java.awt.*;用于导入java.awt.*包中的所有类。AWT是Abstract Window Toolkit的缩写，它是Java提供的一组用于创建图形界面的类和接口。
//import javax.swing.*;导入了javax.swing包中的所有类，这个包中包含了用于创建图形用户界面（GUI）的工具。JFrame、JButton、JLabel等组件都在这个包中。

//需求
//1.窗口长宽
//2.窗口的启动方法
//3.标题
//4.窗口初始大小
//5.使屏幕居中
//6.添加关闭事件
//7.用户不能调整大小
//8.使窗口可见
//9.设置容器颜色
//9.main
public class Gamepanel extends JFrame{
    //定义一个CreateJFrame方法
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);//实例化一个JFrame对象
        Container container=jf.getContentPane()//获取一个容器
        JLabel jl=new JLabel("这是一个JFrame窗体")//创建一个JLabel标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);//使标签上的文字居中
        container.add(jl);//将标签添加到容器中
        container.setBackground(Color.white);//设置容器的背景颜色
        jf.setVisible(true);//使窗体可视
        jf.setSize(200,150);//设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗体关闭方式

    }
    public static void main(String[] args){}



}
