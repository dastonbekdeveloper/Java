import java.util.Scanner;
public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Faradey = ");
        Float Faradey = scanner.nextFloat();
        float Gradus_selsiy = (Faradey - 32) *5 / 9 ;
        System.out.println("Gradus_selsiy = " +  Gradus_selsiy);
    }
}
