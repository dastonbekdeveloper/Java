import java.util.Scanner;
public class Begin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kvadrad tomonini kiriting : ");
        int a = scanner.nextInt();
        int P = 4*a;
        System.out.println("Peremetri : " + P);
    }
}
