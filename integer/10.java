import java.util.Scanner;
public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 xonali son kiriting = ");
        int a = scanner.nextInt();
        int b = a%10;
        int c = a%100;
        int d = c/10;
        System.out.println(" Uning birliklar xonasi : " + b);
        System.out.println(" Uning o'nliklar xonasi : " + d);
    }
}
