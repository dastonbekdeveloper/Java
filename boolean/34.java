import java.util.Scanner;
public class boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doska kardinatasini kiritamiz : ");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        boolean d = (((x1 % 2 == 0) && (y1 % 2 == 1)) || ((x1 % 2 == 1) && (y1 % 2 == 0)));
        System.out.println(d);
    }
}
