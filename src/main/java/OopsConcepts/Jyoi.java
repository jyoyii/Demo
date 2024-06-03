package OopsConcepts;

public class Jyoi extends Nilesh{
    public void fetchJava(){
        super.learnJava();
    }
    public static void main(String[] args) {
        Jyoi obj=new Jyoi();
        obj.fetchJava();
        int a=10;
        String d=a+"";
        System.out.println(d);
        String str=String.valueOf(a);
        System.out.println(str);
    }
}
