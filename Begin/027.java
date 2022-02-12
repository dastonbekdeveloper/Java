import java.util.Scanner;
public class Begin27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        float A = scanner.nextFloat();
        double A2 = A*A;
        System.out.println("A2 = " + A2);
        double A4 = Math.pow(A,4);
        System.out.println("A4 = " + A4);
        double A8 = Math.pow(A,8);
        System.out.println("A8 = " + A8);
    }
}
