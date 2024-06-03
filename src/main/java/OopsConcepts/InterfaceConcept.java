package OopsConcepts;

public interface InterfaceConcept {
    abstract void sleep();
    default void greet(){
        System.out.println("hello");
    }
    default void play(){
        System.out.println("play");
    }
}
