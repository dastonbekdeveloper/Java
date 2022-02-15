import java.util.Scanner;
public class if14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        //int kichik = Math.min(Math.min(a,b),c);    // o'tgan mavzu orqali
        //int katta  = Math.max(Math.max(a,b),c);    // o'tgan mavzu orqali
        //System.out.println("kichik = " + kichik);   // o'tgan mavzu orqali
        // System.out.println("Katta = " + katta);    // o'tgan mavzu orqali
        // a uchun holatlar
        if (a > b && a > c) {
            System.out.println("katta = " + a);
        }
        if(a<b && a<c){
            System.out.println("Kichik = " + a);
        }
        // b uchun holatlar
        if (b > a && b > c){
            System.out.println("katta = " + b);
        }
        if (b < a && b < c){
            System.out.println("kichik = " + b);
        }
        // c uchun holatlar
        if (c>a && c>b){
            System.out.println("katta = " + c);
        }
        if (c<a && c<b){
            System.out.println("kichik = " + c);
        }
    }
}
// misol 2 ta holatda ishlandi
