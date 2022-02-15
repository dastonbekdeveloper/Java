import java.util.Scanner;
public class if3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Butun son kiriting : ");
        int a = scanner.nextInt();
        if ( a > 0)
        {
            int b = a+1;
            System.out.println("1 ga oshirildi : " + b);
        } else if (a<0){
            a=a-2;
            System.out.println("Musbat bo'lmagani uchun : " + a);
        }
        else
            System.out.println("a = " + 10);

    }
}
