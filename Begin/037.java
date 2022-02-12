import java.util.Scanner;
public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" v(1) = ");
        float v1 = scanner.nextFloat();
        System.out.print(" v(2) = ");
        float v2 = scanner.nextFloat();
        System.out.print(" S = ");
        float S = scanner.nextFloat();
        System.out.print(" T = ");
        float t1 = scanner.nextFloat();
        float s = S-(v1+v2)*t1;
        System.out.println(" S = " + s + " (km)");
    }
}
