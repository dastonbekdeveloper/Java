import java.util.Scanner;
public class if5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        int musbat = 0; //dastlar musbat sonlar nolta
        int manfiy = 0; //dastlar manfiy sonlar nolta
        if (a > 0) {
            musbat = musbat + 1;
        } else if (a < 0) {
            manfiy = manfiy + 1;
        }
        if (b > 0) {
            musbat = musbat + 1;
        } else if (b < 0) {
            manfiy = manfiy + 1;
        }
        if (c > 0) {
            musbat = musbat + 1;
        } else if (c < 0) {
            manfiy = manfiy + 1;
        }
        System.out.println(manfiy + " ta manfiy son kiritildi !");
        System.out.println(musbat + " ta musbat son kiritildi !");
    }
}
