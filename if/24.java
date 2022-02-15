import java.util.Scanner;
public class if24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x =  ");
        int x = scanner.nextInt();
        double fx=0.0;
        if(x>0){
            fx= 2*Math.sin(x);
            System.out.println("fx = " + fx);
        }
        else {
            fx = x-6;
            System.out.println("fx = " + fx);
        }
    }
}
