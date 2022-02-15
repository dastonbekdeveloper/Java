import java.util.Scanner;
public class boolean5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        boolean c = (a>=0 && b<-2);
        System.out.println(c);
    }
}
