import java.util.Scanner;
public class if23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kordinatalar kiritilsin : ");
        System.out.print("x1 =  ");
        int x1 = scanner.nextInt();
        System.out.print("y1 =  ");
        int y1 = scanner.nextInt();
        System.out.print("x2 =  ");
        int x2 = scanner.nextInt();
        System.out.print("y2 =  ");
        int y2 = scanner.nextInt();
        System.out.print("x3 =  ");
        int x3 = scanner.nextInt();
        System.out.print("y3 =  ");
        int y3 = scanner.nextInt();
        int x4 = 0, y4=0;
        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else if (x2 == x3) {
            x4 = x1;
        }
        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else if (y2 == y3) {
            y4 = y1;
        }
        System.out.println("y4 = " + "("+ x4 + ","+ y4+ ")");
    }
}
