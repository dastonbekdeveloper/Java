import java.util.Scanner;
public class if11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        if (a!=b){
            a=b=Math.max(a,b);
            System.out.println("Teng bo'lmagani uchun , kattasi o'zlashtirildi = " +a);
        }
        else if (a==b){
            a=b=0;
            System.out.println("Teng bo'lgani uchun nol o'zlashtririldi " +a);
        }
    }
}
