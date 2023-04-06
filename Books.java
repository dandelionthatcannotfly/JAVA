/*2023.4.6 JAVA 检索图书*/

import java.util.Scanner;
public class Books{
    public static void main(String[] args){
        String books[][]={
                {"《Java》", "《Java Web》", "《C语言》", "《C++》", "《Linux C》"},
               {"《论语》", "《资治通鉴》", "《四十二章经》", "《史记》", "《隋唐史》"}
        };
        System.out.println("请输入您想要搜索的书名或关键字：");
        Scanner name=new Scanner(System.in);
        String n=name.next();
        System.out.println("------------搜索结果-----------");
        for(int i=0;i<books.length;i++){
            for(int j=0;j<books[i].length;j++){
                if(books[i][j].contains(n)||books[i][j].toLowerCase().contains(n)){
                    System.out.println(books[i][j]+":"+"第"+(i+1)+"个书柜里的第"+(j+1)+"本书");
                }
            }
        }
    }
}

