/*2023.3.12 JAVA 模拟客车售票系统
* 4211169063-孙婕*/

import java.util.Scanner;
public class sellticketsmodel {
    public static void main(String[] args) {
        System.out.println("简单客车售票系统");
        System.out.println("9排4列的大巴车开始售票");
        //创建一个9排4列的二维数组；
        int a[][] = new int[9][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //填充二维数组，即数值为“1”为“有票 ”；
                a[i][j] = 1;
                System.out.print(a[i][j] + "      ");
            }
            System.out.println();
        }

        //实现多次买票的功能；
        OUT:
        while (true) {
            //输出流：行
            System.out.print("请输入要预定的座位行号：");
            Scanner row = new Scanner(System.in);
            int n = row.nextInt();
            //输入流：列
            System.out.print("请输入要预定的座位列号：");
            Scanner column = new Scanner(System.in);
            int m = column.nextInt();

            System.out.println("简单客车售票系统");
            System.out.println("9排4列的大巴车开始售票");

            //选票并判定选票是否超出所选范围；
            int sum = 0;
            if (n > 0 && m > 0 && n <=9&& m <=4) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        //数值为“0”为“无票”；
                        a[n - 1][m - 1] = 0;
                        sum = sum + a[i][j];
                        System.out.print(a[i][j] + "      ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("您已超出选票范围，请重新选票；");
                break;
            }
                if (sum == 0) {
                    System.out.println("今日票已售空;");
                    break;
                }

                if(n>9&&m>4){
                    System.out.println("您已超出选择范围，请重新选择；");
                    break;
                }


           //正常退出程序
            System.out.println("退出系统请按W,继续请按O");
            Scanner end=new Scanner(System.in);
            String w=end.next();

            switch(w){
                case "W":
                    System.out.println("您已退出程序，欢迎下次光临，祝您旅途愉快！");
                    break OUT;
                case"O":
                    continue;
            }

        }
    }
}

