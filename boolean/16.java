import java.util.Scanner;
public class boolean16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        boolean d = a>9 && a<100&&a%2==0;
        System.out.println(d);
    }
}
