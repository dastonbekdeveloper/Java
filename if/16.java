import java.util.Scanner;
public class if16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        if (a < b && b < c) {
            a = 2 * a;
            b = 2 * b;
            c = 2 * c;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
