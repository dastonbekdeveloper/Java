import java.util.Scanner;
public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Gradus = ");
        Float Gradus = scanner.nextFloat();
        float Radian = Gradus * 3.14f / 180;
        System.out.println("Radian = " + Radian);
    }
}
