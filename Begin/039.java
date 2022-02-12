import java.util.Scanner;
public class Begin39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ax^2 + bx + c  = 0 - misol ko'rinishi ");
        System.out.print(" a = ");
        float a = scanner.nextFloat();
        System.out.print(" b = ");
        float b = scanner.nextFloat();
        System.out.print(" c = ");
        float c = scanner.nextFloat();
        float D = b*b-4*a*c;
        System.out.println(" D = " + D);
        float x1 = (float) (( -b+Math.sqrt(D) )/(2*a));
        float x2 = (float) (( -b-Math.sqrt(D) )/(2*a));
        System.out.println(" x1 = " + x1);
        System.out.println(" x2 = " + x2);
    }
}
