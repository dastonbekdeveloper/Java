import java.util.Scanner;
public class boolean29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X va Y nuqtani kiriting : ");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.println("X1 va Y1 nuqtani kiriting : ");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println("X2 va Y2 nuqtani kiriting : ");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        boolean d = (
                ((x1<x)&&(y1>y)) && ( (x2>x)&&(y2<y))
                );
        System.out.println(d);
    }
}
