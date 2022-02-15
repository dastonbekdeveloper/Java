import java.util.Scanner;
public class if13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        if( (b>a) && (a>c) || (c>a) && (a>b)){
            System.out.println("O'rtadagi son = " + a);
        }
        if( (a>b) && (b>c) || (c>b) && (b>a)){
            System.out.println("O'rtadagi son = " + b);
        }
        if( (a>c) && (c>b) || (b>c) && (c>a)){
            System.out.println("O'rtadagi son = " + c);
        }
        }
    }
