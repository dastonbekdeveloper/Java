import java.util.Scanner;
public class Integer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 2 xonali son kiriting = ");
        int a = scanner.nextInt();
        int b = a/10;
        int c = a%10;
        int d = 10*c+b;
        System.out.print(" Sonni raqamlari o'rni almashsa : " + d);
    }
}
