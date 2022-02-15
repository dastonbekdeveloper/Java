import java.util.Scanner;
public class Integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 3 xonali son kiriting = ");
        int abc = scanner.nextInt();
        int a = abc/100; // yuzliklar xonasidagi raqam
        int b = (abc%100)/10;// o'nliklar xonasidagi raqam
        int c = abc%10; //birliklar xonasidagi raqam
    System.out.println(" Uning birliklar xonasidagi raqam : " + c);
    System.out.println(" Uning yuzliklar xonasidagi raqam : " + a);
    System.out.println(" Uning o'nliklar xonasidagi raqam : " + b);
    System.out.println(" Uning raqamlar yig'indisi : " + (a+b+c));
    }
}
