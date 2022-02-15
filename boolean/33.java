import java.util.Scanner;
public class boolean33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uchburchak tomonlarini kiriting : ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        boolean d = ( (a+b>c) && (b+c>a) && (c+a>b));
        System.out.println(d);
    }
}
