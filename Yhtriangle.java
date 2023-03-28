/*2020.3.12 JAVA 杨辉三角
*4211169063*/

import java.util.Scanner;
public class Yhtriangle {
    public static void main(String[] args) {
        System.out.println("请输入杨辉三角的行数：");
        Scanner row=new Scanner(System.in);
        int r=row.nextInt();
        int arr[][] = new int[r][];
        for (int i= 0; i < arr.length; i++) {
            //遍历行数；
            arr[i] = new int[i+ 1];//开辟每行的空间；
            for (int j = 0; j <arr[i].length; j++) {
                    //行首或行尾为1；
                    if (j==0||j==arr[i].length-1) {
                        arr[i][j]=1;
                    }else{
                        //杨辉三角的规律；
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

                    }
                System.out.print(arr[i][j] + "    ");

                }
                System.out.println();
            }

        }

}



