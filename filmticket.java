/*2023.3.20 JAVA 购买电影票
*孙婕
*4211169063*/

public class filmticket{
        String name;
        int age;
        int price;

    public filmticket(String name,int age,int price){
        this.name=name;
        this.age=age;
        this.price=price;
    }
    public void ticket(){
         System.out.println(name+"\t"+age+"       "+price);
    }
    public static void main(String[] args){
        System.out.println("姓名"+"\t"+"年龄"+"\t"+"票价（元）");
        System.out.println("————————————————————————————");
        filmticket tickets1=new filmticket("李明",20,40);
        filmticket tickets2=new filmticket("钱丽",16,20);
        filmticket tickets3=new filmticket("周刚",8,20);
        filmticket tickets4=new filmticket("吴红",32,40);

        tickets1.ticket();
        tickets2.ticket();
        tickets3.ticket();
        tickets4.ticket();

    }
}
