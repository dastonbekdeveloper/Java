import java.util.Scanner;
public class Integer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" bayt = ");
        int a = scanner.nextInt();
        int b = a/1024;
        System.out.println(" Sof " + b + " Kbayt buladi" );
    }
}
