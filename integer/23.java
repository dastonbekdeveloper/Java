import java.util.Scanner;
public class Integer23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Necha sekund = ");
        int a = scanner.nextInt();
        int b = (int) (a/3600); // soat
        int c = (int) (a%3600); //soatdan qolgan sekund
        int d = (int) (c/60); // minut
        int e = (int) (c%60); // kerakli sekund
        System.out.print(" Kun boshidan boshlar " + b +  " to'la soat , ");
        System.out.print( d +  " minut ");
        System.out.println(" va " + e +  " sekund o'tdi");
    }
}
