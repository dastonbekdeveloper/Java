import java.util.Scanner;
public class boolean9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        boolean d = ( (a%2==1 && b%2==0) || (a%2==0 && b%2==1) || (a%2==1 && b%2==1) );
        System.out.println(d);
    }
}