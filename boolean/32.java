import java.util.Scanner;
public class boolean32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uchburchak tomonlarini kiriting : ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        boolean d = ( (a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b));
        System.out.println(d);
    }
}
