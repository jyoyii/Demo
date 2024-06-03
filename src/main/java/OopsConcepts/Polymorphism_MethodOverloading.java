package OopsConcepts;

public class Polymorphism_MethodOverloading {
    void area(int a)
    {
        int square=a*a;
        System.out.println("Area of Parent Class square" +square);
    }
    void area(double l, double w){
        double rectangle=l*w;
        System.out.println("Area of Rectangle" +rectangle);
    }
    int area(int l, double w){
        double rectangle=l*w;
        System.out.println("Area of Rectangle1" +rectangle);
        return  0;
    }
    public static void main(String[] args) {
        Polymorphism_MethodOverloading obj=new Polymorphism_MethodOverloading();
        Polymorphism_MethodOverloading childObjParent=new Polymorphism_MethodOverriding();
        obj.area(10);
        obj.area(2,4);
        //OverRides parent method - obj created
        childObjParent.area(6);

    }
}
