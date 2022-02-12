import java.util.Scanner;
public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" x1 = ");
        int x1 = scanner.nextInt();
        System.out.println(" x2 = ");
        int x2 = scanner.nextInt();
        int d = Math.abs(x2-x1);
        System.out.println("d = " + d );
    }
}
