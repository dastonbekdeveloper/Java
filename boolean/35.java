import java.util.Scanner;
public class boolean35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-nuqta kardinatasini kiritamiz : ");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        boolean d1 = (((x1 % 2 == 0) && (y1 % 2 == 1)) || ((x1 % 2 == 1) && (y1 % 2 == 0)));
        // d1 - oq rangning kodi (x1 va y1 uchun)
        boolean d2 = !(((x1 % 2 == 0) && (y1 % 2 == 1)) || ((x1 % 2 == 1) && (y1 % 2 == 0)));
        // d2 - qora rangning kodi (x1 va y1 uchun)
        System.out.println("2-nuqta kardinatasini kiritamiz : ");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        boolean e1 = (((x2 % 2 == 0) && (y2 % 2 == 1)) || ((x2 % 2 == 1) && (y2 % 2 == 0)));
        // e1 - oq rangning kodi (x2 va y2 uchun)
        boolean e2 = !(((x2 % 2 == 0) && (y2 % 2 == 1)) || ((x2 % 2 == 1) && (y2 % 2 == 0)));
        // e2 - qora rangning kodi (x2 va y2 uchun)
        boolean n = (
                (d1==e1) || (d2==e2)
                );
        System.out.println(n);
    }
}
