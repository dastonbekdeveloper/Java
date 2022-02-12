import java.util.Scanner;
public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grudus = ");
        float Gradus = scanner.nextFloat();
        Float Faradey = (9*Gradus+160)/5 ;
        System.out.println("Faradey = " + Faradey );
    }
}
