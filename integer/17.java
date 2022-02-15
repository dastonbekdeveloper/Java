import java.util.Scanner;
public class Integer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 4 xonali son kiriting = ");
        int a = scanner.nextInt();
        int b = (int) (a/100);
        int c = (int) (b%10);
        System.out.println(" Yuzlik xonasidagi son " + c);
    }
}
