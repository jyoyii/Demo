package OopsConcepts;

import static OopsConcepts.SingletonEx.getInstance123;

public class Nilesh {
    public void learnJava(){
        System.out.println("Nilesh class");
    }

    public static void main(String[] args) {
        WeekDays str=WeekDays.MONDAY;
        System.out.println(str);
        String str1="123";
        int x=Integer.parseInt(str1);
        System.out.println(x);
        float f=Float.parseFloat(str1);
        System.out.println(f);
        //SingletonEx obj1=new SingletonEx();
        SingletonEx st=getInstance123();
    }
}
