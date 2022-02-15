import java.util.Scanner;
public class if15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        int middle = 0; //o'rtadagi son
        if( (b>a) && (a>c) || (c>a) && (a>b)){
            middle = a;
        }
        else if( (a>b) && (b>c) || (c>b) && (b>a)){
            middle = b;
        }
        else if( (a>c) && (c>b) || (b>c) && (c>a)){
            middle = c;
        }
        int max  = Math.max(Math.max(a,b),c);    // max
        System.out.println("middle = " + middle );
        System.out.println("Max = " + max);
        System.out.println("S = " + (max+middle));
    }
}
