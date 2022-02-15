import java.util.Scanner;
public class Integer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1 - Dushanba " );
        System.out.println(" 2 - Seshanba " );
        System.out.println(" 3 - Chorshanba " );
        System.out.println(" 4 - Payshanba " );
        System.out.println(" 5 - Juma " );
        System.out.println(" 6 - shanba " );
        System.out.println(" 7 - Yakshanba " );
        System.out.print(" Kechanchi kun = ");
        int a = scanner.nextInt();
        int c = (a+5)%7+1;
        System.out.println(" Qaysi raqam chiqqan bo'lsa o'sha kun ya'ni " + c );
    }
}
