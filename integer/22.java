import java.util.Scanner;
public class Integer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Necha sekund = ");
        float a = scanner.nextInt();
        int b = (int) (a/3600);
        int c = (int) (a%3600);
        System.out.print(" Kun boshidan boshlar " + b +  " to'la soat ");
        System.out.println(" va " + c +  " sekund o'tdi");
    }
}
