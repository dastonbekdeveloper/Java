import java.util.Scanner;
public class Integer29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" To'g'ri to'rtburchak tomonlarini kiritaniz :  ");
        System.out.print(" a = ");
        int a = scanner.nextInt();
        System.out.print(" b = ");
        int b = scanner.nextInt();
        int S1= a*b;
        System.out.println("T.T Yuzi = " + S1);
        System.out.print("Kvadrad tomonini kiritamiz : ");
        int c = scanner.nextInt();
        int S2 = c*c;
        System.out.println("Kvadrad Yuzi  : " + S2);
        int T = (a/c)*(b/c);
        System.out.print("Demak , " + T + " ta kvadrad joylashtirsa buladi"  );
        int K = S1-S2*T;
        System.out.print( " Va " + K + "m kvadrad yuzasi sig'maydi"  );
    }
}
