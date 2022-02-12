import java.util.Scanner;
public class Begin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("R = ");
        double R = scanner.nextDouble();
        double C = 2*Math.PI*R;
        double S = Math.PI*R*R;
        System.out.println(" C = " + C);
        System.out.println(" S = " + S);
    }
}
