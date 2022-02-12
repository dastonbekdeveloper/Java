import java.util.Scanner;
public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Shkalat Kg mi :  = ");
        Float Klogrami  = scanner.nextFloat();
        System.out.print(" Shu kg narxi :  = ");
        Float Shu_narx  = scanner.nextFloat();
        float kg = Shu_narx/Klogrami ;
        System.out.println(" 1 kg shakalat narxi :  = " + kg);
        System.out.print(" konfet Kg mi :  = ");
        Float Klogramii  = scanner.nextFloat();
        System.out.print(" Shu kg narxi :  = ");
        Float Shu_narxi  = scanner.nextFloat();
        float kgg = Shu_narxi/Klogramii ;
        System.out.println(" 1 kg konfet narxi :  = " + kg);
        float f = kg-kgg;
        System.out.println(" Demak , 1 kg shokalat , 1 kg konfetdan " + f +  " so'm qimmat ekan");
    }
}
