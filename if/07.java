import java.util.Scanner;
public class if7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 ta son kiriting : ");
        System.out.print("a =  ");
        int a = scanner.nextInt();
        System.out.print("b =  ");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("Ikkinchi kiritilgan son kichik ");
        }
        else if (b>a){
            System.out.println("Birinchi kiritilgan son kichik ");
        }
        else {
            System.out.println("ikalasi ham teng");
        }
    }
}
