import java.util.Scanner;
public class Begin11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" a = ");
        int a = scanner.nextInt();
        System.out.println(" b = ");
        int b = scanner.nextInt();
        int Y = a+b;
        int K = a*b;
        int ModA = Math.abs(a) ;
        int ModB = Math.abs(b) ;
        System.out.println("Y = " + Y );
        System.out.println("K = " + K );
        System.out.println("ModA = " + ModA );
        System.out.println("ModB = " + ModB );
    }
}
