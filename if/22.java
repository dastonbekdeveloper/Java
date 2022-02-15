import java.util.Scanner;
public class if22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kordinatalar kiritilsin : ");
        System.out.print("x =  ");
        int x = scanner.nextInt();
        System.out.print("y =  ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1-chorak");
        }
        if (x < 0 && y > 0) {
            System.out.println("2-chorak");
        }
        if (x < 0 && y < 0) {
            System.out.println("3-chorak");
        }
        if (x > 0 && y < 0) {
            System.out.println("4-chorak");
        }
    }
}
