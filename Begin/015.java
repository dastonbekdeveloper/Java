import java.util.Scanner;
public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("L = ");
        double L = scanner.nextDouble();
        double R = L/(2*Math.PI);
        System.out.println("R = " + R);
        float S = Math.PI*R*R;
        System.out.println("S = " + S);
    }
}
