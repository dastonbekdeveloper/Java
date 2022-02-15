import java.util.Scanner;
public class if12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        if ( a<b && a<c){
            System.out.println("Eng kichigi = " + a);
        }
        if ( b<a && b<c){
            System.out.println("Eng kichigi = " + b);
        }
        if ( c<a && c<b){
            System.out.println("Eng kichigi = " + c);
        }
        }
    }
