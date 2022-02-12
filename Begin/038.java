import java.util.Scanner;
public class Begin38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ax + b = 0 - misol ko'rinishi ");
        System.out.print(" A = ");
        float A = scanner.nextFloat();
        System.out.print(" b = ");
        float b = scanner.nextFloat();
        float j = -b/A ;
        System.out.println("J = " + j);
    }
}
