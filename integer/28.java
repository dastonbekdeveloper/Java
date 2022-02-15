import java.util.Scanner;
public class Integer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1 - Dushanba " );
        System.out.println(" 2 - Seshanba " );
        System.out.println(" 3 - Chorshanba " );
        System.out.println(" 4 - Payshanba " );
        System.out.println(" 5 - Juma " );
        System.out.println(" 6 - shanba " );
        System.out.println(" 7 - Yakshanba " );
        System.out.print(" Nechanchi kun = ");
        int n = scanner.nextInt();
        System.out.print(" 1-yanvar kun = ");
        int k = scanner.nextInt();
        int c = (n+k-2)%7+1;
        System.out.println(" Qaysi raqam chiqqan bo'lsa o'sha kun ya'ni " + c );
    }
}
