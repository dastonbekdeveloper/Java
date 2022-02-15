import java.util.Scanner;
public class boolean2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toq son kiriting : ");
        int a = scanner.nextInt();
        boolean b = a%2==1;
        System.out.println(b);
    }
}
