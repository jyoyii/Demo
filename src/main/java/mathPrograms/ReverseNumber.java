package mathPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int result = 0;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();*/
        int n=-6789;
        while (n != 0) {
            int lastDigit = n % 10;

            /*
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                System.out.println(-1);
            }*/
            result = ( 10 * result )+ lastDigit;
            n = n / 10;
        }
        System.out.println(result);
    }
}
