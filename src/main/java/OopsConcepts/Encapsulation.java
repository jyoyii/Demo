package OopsConcepts;

public class Encapsulation {
    private int sno=10;
    private String sname="jyo";
    public void setSno(int n){
        this.sno=n;
    }
    public void setSname(String str){
        this.sname=str;
    }
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setSname("Nach");
        obj.setSno(100);
        obj.getSno();
        obj.getSname();
    }
    public void getSname() {
        System.out.println(sname);
    }

    public void getSno() {
        System.out.println(sno);
    }
}
