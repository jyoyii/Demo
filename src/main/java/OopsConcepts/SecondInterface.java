package OopsConcepts;

public interface SecondInterface {
    abstract void groom();
    default void learn(){
        System.out.println("Second Interface dog learn");
    }
}
