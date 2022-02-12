import java.util.Scanner;
public class Begin24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        int d = a;
        a=b;
        b=c;
        c=d;
        System.out.print("a = "+a);
        System.out.print("b = "+b);
        System.out.print("c = "+c);
    }
}
