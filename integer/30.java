import java.util.Scanner;
public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Yilni kiriting :  ");
        int a = scanner.nextInt();
        int b = a/100+1;
        System.out.println(" " + b + " yuz yillikka kiradi");
    }
}
