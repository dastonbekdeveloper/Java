import java.util.Scanner;
public class if18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        System.out.print("c =  ");
        int c = scanner.nextInt();
        if(a==b){
            System.out.println("Qolganini tartib raqami = 3 ");
        }
        if(a==c){
            System.out.println("Qolganini tartib raqami = 2 ");
        }
        if(b==c){
            System.out.println("Qolganini tartib raqami = 1 ");
        }
    }
}
