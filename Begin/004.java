import java,util.Scanner;
public class Begin4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("diametr = ");
        double d = scanner.nextDouble();
        double L = Math.PI*d;
        System.out.println("L = " + L);
    }
}
