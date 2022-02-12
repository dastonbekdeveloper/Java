import java.util.Scanner;
public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Radian = ");
        Float Radian = scanner.nextFloat();
        float Gradus = Radian *  180 / 3.14f;
        System.out.println("Gradus= " + Gradus);
    }
}
