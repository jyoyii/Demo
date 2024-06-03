package OopsConcepts;

public class Polymorphism_MethodOverriding extends Polymorphism_MethodOverloading{
    void area(int a){
        int square=a*a;
        System.out.println("Area of Child Class square" +square);
    }
    public static void main(String[] args) {
        Polymorphism_MethodOverriding childObj=new Polymorphism_MethodOverriding();
        childObj.area(2);
    }
}
