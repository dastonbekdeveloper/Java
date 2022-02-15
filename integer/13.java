import java.util.Scanner;
public class Integer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 xonali son kiriting = ");
        int a = scanner.nextInt();
        int b = a%10; // birliklar xonasidagi raqam
        int c = a%100;
        int d = c/10; // o'nliklar xonasidagi raqam
        int e = a/100; //yukliklar xonasidagi raqam
        System.out.println(" Uning birliklar xonasidagi raqam : " + b);
        System.out.println(" Uning o'nliklar xonasidagi raqam : " + d);
        System.out.println(" Uning yuzliklar xonasidagi raqam : " + e);
        System.out.print(" Chapdan bittasini o'chirib o'ngga yozsak : " +  d);
        System.out.print( e );
        System.out.print( b );
    }
}
