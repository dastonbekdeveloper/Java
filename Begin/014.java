import java.util.Scanner;
public class Begin14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("S = ");
        double S = scanner.nextDouble();
        double R = Math.sqrt(S/Math.PI);
        double d = 2*R;
        System.out.println("R = " + R);
        System.out.println("d = " + d);
        }
    }
