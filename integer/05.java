import java.util.Scanner;
public class Integer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" A kesma uzunligi = ");
        int a = scanner.nextInt();
        System.out.print(" B kesma uzunligi = ");
        int b = scanner.nextInt();
        int c = a/b;
        System.out.println(" Demak, A kesmada B kesmani " + c + " marta joylashtirsa bo'larkan" );
        int d = a%b;
        System.out.println(" Joylashmagan qismi uzunligi : " + d);



    }
}
