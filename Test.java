/*2023.3.27 JAVA  创建昆虫类
* 4211169063*/

//一个表示飞行的接口Flyable
interface Flyable {
    void fly();
}

//抽象的昆虫类
abstract class Insect{
    //定义昆虫有多少条腿
    int legs;
    public void Insect(int legs){
        this.legs = legs;
    }
    public Insect(){
        legs=6;
    }
    //一个表示繁殖的抽象方法
    abstract void reproduce();
}
//苍蝇类，继承昆虫类Insert,并实现接口Flyable
class housefly extends Insect implements Flyable{
    public void fly(){
        System.out.println("苍蝇有"+legs+"条腿");
        System.out.println("苍蝇可以在空中飞行");
    }
    public void reproduce(){
        System.out.println("苍蝇的繁殖方式是产卵");
    }
}
public class Test {
        public static void main(String[] args) {
            housefly h=new housefly();
            h.fly();
            h.reproduce();
        }
    }



