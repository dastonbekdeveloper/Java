import java.util.Scanner;
public class Begin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        int S = a*b ;
        int P = 2*(a+b);
        System.out.println("S = " + S);
        System.out.println("P = " + P);
    }
}
