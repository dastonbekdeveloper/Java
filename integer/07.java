import java.util.Scanner;
public class Integer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 2 xonali son kiriting = ");
        int a = scanner.nextInt();
        int b = (int) (a/10); // birinchi raqam
        int c = (int) (a%10); // ikkinchi raqam
        int d= b+c;
        System.out.println(" Raqamlar yig'indisi : " + d);
    }
}
