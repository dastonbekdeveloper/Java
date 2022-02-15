import java.util.Scanner;
public class boolean18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        boolean d = ( a==b || b==c || a==c);
        System.out.println(d);
    }
}
