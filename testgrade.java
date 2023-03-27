/*2023.3.13  JAVA */
import java.util.Scanner;
public class testgrade {
    public static void main(String[] args) {
        System.out.println("您想调取第几位同学的答案结果（有效数字为1至8）：");
        Scanner answer = new Scanner(System.in);
        int n = answer.nextInt();

        //赋值并声明正确答案right;
        String[] right = new String[]{"B", "A", "D", "C", "C", "B", "C", "A", "D", "B"};
        //8位学生的答案
        String[][] grade = {{"A", "A", "D", "B", "B", "B", "C", "A", "C", "A"},
                {"B","A", "D", "B", "A", "B", "C", "A", "C", "B"},
                {"B", "A", "D", "D", "C", "B", "C", "B", "D", "B"},
                {"B", "A", "D", "A", "C", "C", "C", "A", "D", "B"},
                {"B", "A", "B", "C", "C", "B", "C", "B", "D", "B"},
                {"B", "A", "D", "C", "D", "B", "C", "A", "D", "D"},
                {"B", "A", "D", "C", "C", "A", "C", "A", "D", "B"},
                {"B", "B", "B", "C", "A", "B", "C", "A", "D", "B"}};
        System.out.println("第" + n + "位同学的全部答案为：");


            for(String j:grade[n-1])
                System.out.print(j+" ");
            System.out.println();

            int sum=0;
                for(int j=0;j<grade[n-1].length;j++){
                    if(grade[n-1][j]==right[j])
                sum++;}
            System.out.println("第"+n+"位同学一共答对"+sum+"道题");

    }

}

