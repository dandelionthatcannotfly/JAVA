/*2023.3.20 JAVA 计算平均分
* 4211169063*/
public class averagegrade {
    int num;
    String name;
    float c;//语文
    float m;//数学
    float e;//英语
    public averagegrade(int num,String name,float c,float m,float e){
            this.num=num;
            this.name=name;
            this.c=c;
            this.m=m;
            this.e=e;

        }

    public void average(){
        //定义平均分
         float average=(c+m+e)/3;
        //输出
        System.out.println(num+"    "+name+"    "+c+"    "+m+"    "+e+"    "+average);
    }

    public static void main(String[] args){
        System.out.println("学号    姓名    语文    数学    英语    平均分");
        System.out.println("———————————————————————————————————————————————");
        averagegrade grade1=new averagegrade(1,"张三",91.5f,98f,89f);
        averagegrade grade2=new averagegrade(2,"李四",96f,98.5f,93f);
        averagegrade grade3=new averagegrade(3,"王五",97f,100f,98.5f);
        averagegrade grade4=new averagegrade(4,"钱六",77f,83f,81f);

        grade1.average();
        grade2.average();
        grade3.average();
        grade4.average();
    }
}
