import java.util.Scanner;
public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.print("a = " + a);
        System.out.print("b = " + b);
    }
}
