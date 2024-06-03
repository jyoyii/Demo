package OopsConcepts;

public class SingletonEx {
    private static SingletonEx instance;
    private SingletonEx(){

    }
    public static SingletonEx getInstance123(){
        if (instance == null) {
            instance = new SingletonEx();
        }
        return instance;
    }

    public static void main(String[] args) {
        getInstance123();
    }
}
