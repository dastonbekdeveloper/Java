import java.util.Scanner;
public class if21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kordinatalar kiritilsin : ");
        System.out.print("x =  ");
        int x = scanner.nextInt();
        System.out.print("y =  ");
        int y = scanner.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Natija nol");
        } else if (x != 0 && y == 0) {
            System.out.println("Natija birga teng");
        }
        else if(y != 0 && x == 0){
            System.out.println("Natija 2 ga teng");
        }
        else {
            System.out.println("Natija 3 ga teng");
        }
    }
}
