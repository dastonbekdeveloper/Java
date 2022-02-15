import java.util.Scanner;
public class if4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        int k = 0;
        if (a > 0) {
            k = k + 1;
        }
        if (b > 0) {
            k = k + 1;
        }
        if (c > 0) {
             k = k + 1;
        }
        System.out.println(k + " ta musbat son bor ! ");
    }
}
