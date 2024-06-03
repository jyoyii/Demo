package stringPrograms;

public class SubStringInAString {
    public static void main(String[] args) {
        String str="estabctestabctestab";
        String substr="test";
        if(str.contains(substr)){
            System.out.println(str.indexOf(substr));
        }
    }
}
