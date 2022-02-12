import java.util.Scanner;
public class Begin23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        a=a+c;
        c=a-c;
        a=a-c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.print("c = " + c);
    }
}
