import java.util.Scanner;
public class Begin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" a = ");
        int a = scanner.nextInt();
        System.out.println(" b = ");
        int b = scanner.nextInt();
        System.out.println(" c = ");
        int c = scanner.nextInt();
        int V = a*b*c;
        int S = 2*(a*b + b*c + a*c );
        System.out.println("V = " + V );
        System.out.println("S = " + S );
    }
}
