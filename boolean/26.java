import java.util.Scanner;
public class boolean26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("X va Y nuqtani kiriting : ");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        boolean d = ( (x>0) && (y<0));
        System.out.println(d);
    }
}
