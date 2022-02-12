import java.util.Scanner;
public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        float A = scanner.nextFloat();
        double A2 = A*A;
        System.out.println("A2 = " + A2);
        double A3 = Math.pow(A,3);
        System.out.println("A3 = " + A3);
        double A5 = Math.pow(A,5);
        System.out.println("A5 = " + A5);
        double A10 = Math.pow(A,10);
        System.out.println("A10 = " + A10);
        double A15 = Math.pow(A,15);
        System.out.println("A15 = " + A15);

    }
}
