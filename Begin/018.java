import java.util.Scanner;
public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" A = ");
        int a = scanner.nextInt();
        System.out.println(" B = ");
        int b = scanner.nextInt();
        System.out.println(" C = ");
        int c = scanner.nextInt();
        int ac = Math.abs(a-c);
        int bc = Math.abs(b-c);
        int acbc = ac * bc;
        System.out.println(" ac = " + ac);
        System.out.println(" bc = " + bc);
        System.out.println(" acbc = " + acbc);
    }
}
