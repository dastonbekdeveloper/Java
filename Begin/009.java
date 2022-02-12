import java.util.Scanner;
public class Begin9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" a = ");
        double a = scanner.nextDouble();
        System.out.println(" b = ");
        double b = scanner.nextDouble();
        double G = Math.sqrt(a*b);
        System.out.println("G = " + G );
    }
}
