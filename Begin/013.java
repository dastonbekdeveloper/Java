import java.util.Scanner;
public class Begin13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("R1 = ");
        double R1 = scanner.nextDouble();
        System.out.println("R2 = ");
        double R2 = scanner.nextDouble();
        double S1 = Math.PI*R1*R1;
        double S2 = Math.PI*R2*R2;
        double S3 = S1-S2;
        System.out.println("S1 = " + S1);
        System.out.println("S2 = " + S2);
        System.out.println("S3 = " + S3);
    }
}
