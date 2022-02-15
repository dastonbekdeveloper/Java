import java.util.Scanner;
public class Integer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Necha sekund = ");
        float a = scanner.nextInt();
        int b = (int) (a/60);
        System.out.println(" Kun boshidan boshlar " + b +  " to'la minut o'tdi");
    }
}
