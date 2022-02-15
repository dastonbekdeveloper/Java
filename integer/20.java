import java.util.Scanner;
public class Integer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Necha sekund = ");
        int a = scanner.nextInt();
        int b = (int) (a/3600);
        System.out.println(" Kun boshidan boshlar " + b +  " to'la soat o'tdi");
    }
}
