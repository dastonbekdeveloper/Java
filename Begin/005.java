import java.util.Scanner;
public class Begin5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(" a = ");
        int a = scanner.nextInt();
        int V = a*a*a;
        int S = 6*a*a;
        System.out.println("V = " + V );
        System.out.println("S = " + S );
    }
}
