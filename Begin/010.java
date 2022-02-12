import java.util.Scanner;
public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" a = ");
        int a = scanner.nextInt();
        System.out.println(" b = ");
        int b = scanner.nextInt();
        int Y = a+b;
        int K = a*b;
        int KvadA = a*a ;
        int KvadB = b*b ;
        System.out.println("Y = " + Y );
        System.out.println("K = " + K );
        System.out.println("KvadA = " + KvadA );
        System.out.println("KvadA = " + KvadB );
    }
}
