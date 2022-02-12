import java.util.Scanner;
public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" A(x1,y1) - kordinatalarini kiritamiz");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println(" B(x2,y2) - kordinatalarini kiritamiz");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        System.out.println( "A(" + x1 + ";" + y1 + ") ");
        System.out.println( "B(" + x2 + ";" + y2 + ")");
        int a = Math.abs(x1-x2);
        System.out.println("a = " + a);
        int b = Math.abs(y2-y1);
        System.out.println("b = " + b);
        int p = 2*(a+b);
        int s = a*b ;
        System.out.println("p = " + p);
        System.out.println("s = " + s);
    }
}
