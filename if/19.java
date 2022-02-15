import java.util.Scanner;
public class if19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        System.out.print("d =  ");
        int d = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Qolganini tartib raqami = 4 ");
        }
        if (a == b && b == d) {
            System.out.println("Qolganini tartib raqami = 3 ");
        }
        if (a == c && c == d) {
            System.out.println("Qolganini tartib raqami = 2 ");
        }
        if (b == c && c == d) {
            System.out.println("Qolganini tartib raqami = 1 ");
        }
    }
}
