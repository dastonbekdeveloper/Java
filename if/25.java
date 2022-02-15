import java.util.Scanner;
public class if25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x =  ");
        double x = scanner.nextDouble();
        double fx=0.0;
        if(x>2.0 && x<-2.0){
            fx = 2*x;
            System.out.println("fx = " + fx);
        }
        else {
            fx=-3*x;
            System.out.println("fx = " + fx);
        }
    }
}
