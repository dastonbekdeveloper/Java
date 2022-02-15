import java.util.Scanner;
public class boolean7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        boolean d = (c>b && b>a) || (a>b && b>c);
        System.out.println(d);
    }
}
