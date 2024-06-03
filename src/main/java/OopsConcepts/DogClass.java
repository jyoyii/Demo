package OopsConcepts;

public class DogClass extends ParentClassConcept implements InterfaceConcept,SecondInterface{

    @Override
    public void sleep() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        DogClass obj=new DogClass();
        obj.greet();
    }

    @Override
    public void groom() {
        System.out.println("Second Interface dog groom");
    }
}
