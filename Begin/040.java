import java.util.Scanner;
public class Begin40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" a(1)x + b(1)y = c(1) ");
        System.out.println(" a(2)x + b(2)y = c(2) - misol ko'rinishi ");
        System.out.print(" a(1) = ");
        float a1 = scanner.nextFloat();
        System.out.print(" b(1) = ");
        float b1 = scanner.nextFloat();
        System.out.print(" c(1) = ");
        float c1 = scanner.nextFloat();
        System.out.print(" a(2) = ");
        float a2 = scanner.nextFloat();
        System.out.print(" b(2) = ");
        float b2 = scanner.nextFloat();
        System.out.print(" c(2) = ");
        float c2 = scanner.nextFloat();
        float d = a1*b2-a2*b1;
        System.out.println(" D = " + d);
        float x = (float) (c1*b2-c2*b1)/d;
        float y = (float) (a1*c2-a2*c1)/d;
        System.out.println(" x1 = " + x);
        System.out.println(" x2 = " + y);
    }
}
