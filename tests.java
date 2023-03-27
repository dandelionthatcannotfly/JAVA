/*2023.3.12  JAVA  自动批卷程序
* 4211169063-孙婕*/

import java.util.Scanner;
import java.util.Arrays;
public class tests {
    public static void main(String[] args) {
        System.out.println("您想调取第几位学生的答案结果（有效数字为1~8，标准答案请按0）:");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        char arr[][] = new char[9][];


        //arr[0]为标准答案；从arr[1]开始为第一位同学的答案；


        arr[0] = new char[]{'B', 'A', 'D', 'C', 'C', 'B', 'C', 'A', 'D', 'B'};
        arr[1] = new char[]{'A', 'A', 'D', 'B', 'A', 'B', 'C', 'A', 'C', 'A'};
        arr[2] = new char[]{'B', 'A', 'D', 'B', 'A', 'B', 'C', 'A', 'C', 'B'};
        arr[3] = new char[]{'B', 'A', 'D', 'D', 'C', 'B', 'C', 'B', 'D', 'B'};
        arr[4] = new char[]{'B', 'A', 'D', 'A', 'C', 'C', 'C', 'A', 'D', 'B'};
        arr[5] = new char[]{'B', 'A', 'B', 'C', 'C', 'B', 'C', 'B', 'D', 'B'};
        arr[6] = new char[]{'B', 'A', 'D', 'C', 'D', 'B', 'C', 'A', 'D', 'D'};
        arr[7] = new char[]{'B', 'A', 'D', 'C', 'C', 'A', 'C', 'A', 'D', 'B'};
        arr[8] = new char[]{'B', 'B', 'B', 'C', 'A', 'B', 'C', 'A', 'D', 'B'};


        switch (n) {
            case 0:
                System.out.println("标准答案为：" + "\n" + Arrays.toString(arr[0]));
                break;
            case 1:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[1]));
                break;
            case 2:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[2]));
                break;
            case 3:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[3]));
                break;
            case 4:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[4]));
                break;
            case 5:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[5]));
                break;
            case 6:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[6]));
                break;
            case 7:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[7]));
                break;
            case 8:
                System.out.println("第" + n + "位同学的全部答案为：" + "\n" + Arrays.toString(arr[8]));
                break;
        }

        int sum = 0;//定义答对的题数；



            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr.length;j++)
                if(arr[n]==arr[0]) {
                    boolean b = arr[n].equals(arr[0]);
                    if (true) {
                        sum++;
                        break;
                    } else {
                        continue;
                    }
                }

            }
            System.out.println("第" + n + "位同学一共答对了" + (sum) + "道题");



    }
}
