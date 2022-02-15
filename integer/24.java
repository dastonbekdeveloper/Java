import java.util.Scanner;
public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Kechanchi kun = ");
        int a = scanner.nextInt();
        int b = a%7 ;
        System.out.println(" 1 - Dushanba " );
        System.out.println(" 2 - Seshanba " );
        System.out.println(" 3 - Chorshanba " );
        System.out.println(" 4 - Payshanba " );
        System.out.println(" 5 - Juma " );
        System.out.println(" 6 - shanba " );
        System.out.println(" 0 - Yakshanba " );
        System.out.println(" Qaysi raqam chiqqan bo'lsa o'sha kun ya'ni " + b );
    }
}
