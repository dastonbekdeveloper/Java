import java.util.Scanner;
public class if20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        double a = scanner.nextInt();
        System.out.print("b =  ");
        double b = scanner.nextInt();
        System.out.print("c =  ");
        double c = scanner.nextInt();
        if (Math.abs(a - b) < Math.abs(a - c)) {
            int masofa = (int) Math.abs(a - b);
            System.out.println("Yaqin nuqta b , masofa = " + masofa);
        } else {
            int masofa = (int) Math.abs(a - c);
            System.out.println("Yaqin nuqta c , masofa = " + masofa);
        }
    }
}
