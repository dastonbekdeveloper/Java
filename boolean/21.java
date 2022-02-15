import java.util.Scanner;
public class boolean21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 xonali son kiriting = ");
        int a = scanner.nextInt();
        int b = (int) (a%10); // birliklar xonasidagi raqam
        int c = (int) (a%100);
        int d = (int) (c/10); // o'nliklar xonasidagi raqam
        int e = (int) (a/100); //yukliklar xonasidagi raqam
        System.out.println(" Uning birliklar xonasidagi raqam : " + b);
        System.out.println(" Uning o'nliklar xonasidagi raqam : " + d);
        System.out.println(" Uning yuzliklar xonasidagi raqam : " + e);
        boolean l = ( (d==e+1)&&(b==d+1));
        System.out.println(l);
    }
}
