import java.util.Scanner;
public class Integer21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Necha sekund = ");
        float a = scanner.nextInt();
        int b = (int) (a/60);
        int c = (int) (a%60);
        System.out.println(" Kun boshidan boshlar " + b +  " to'la minut o'tdi");
        System.out.println(" Kun boshidan boshlar " + c +  " to'la sekund o'tdi");
    }
}
