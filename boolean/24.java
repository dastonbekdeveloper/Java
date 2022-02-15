import java.util.Scanner;
public class boolean24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ax^2 + bx + c  = 0 - misol ko'rinishi ");
        System.out.print(" a = ");
        float a = scanner.nextFloat();
        System.out.print(" b = ");
        float b = scanner.nextFloat();
        System.out.print(" c = ");
        float c = scanner.nextFloat();
        float D = b*b-4*a*c;                     // Math.sqrt(D);
        System.out.println(" D = " + D);
        boolean g = (D>=0) ;
        System.out.println(g);
    }
}
