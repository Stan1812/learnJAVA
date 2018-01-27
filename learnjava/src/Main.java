import java.io.*;
class FreshJuice {
  enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
  FreshJuiceSize size;
}
class Dog{
  private int age;
  private String color;
  private String name;
  public Dog(String name,int age, String color){
    this.name = name;
    this.age=age;
    this.color=color;
  }
  void barking(){
    System.out.println(" wa wa wa");
  }
  public void intrduce (){
    System.out.println(this.age+this.color+this.name);
  }
  public void hungry(){
    System.out.println("im hungry");
  }

  void sleeping(){
    System.out.println("dont bother me");
  }
}
public class Main {
  public static void main(String []args){
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
    Dog wolf =new Dog("baby",10,"black");
    wolf.intrduce();
    wolf.barking();
    wolf.hungry();
  }
}