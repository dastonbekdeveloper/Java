import java.util.Scanner;
public class boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        boolean d = a>99 && a<1000&&a%2==1;
        System.out.println(d);
    }
}
