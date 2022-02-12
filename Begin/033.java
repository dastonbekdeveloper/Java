import java.util.Scanner;
public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Shkalat Kg mi :  = ");
        Float Klogrami  = scanner.nextFloat();
        System.out.print(" Shu kg narxi :  = ");
        Float Shu_narx  = scanner.nextFloat();
        System.out.print(" y :  = ");
        Float y  = scanner.nextFloat();
        float kg = Shu_narx/Klogrami ;
        float kgy = y*Shu_narx/Klogrami ;
        System.out.print(" 1 kg narxi :  = " + kg);
        System.out.print(" y kg narxi :  = " + kgy);
    }
}
