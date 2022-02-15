import java.util.Scanner;
public class boolean40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-nuqta kardinatasini kiritamiz : ");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println("2-nuqta kardinatasini kiritamiz : ");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        boolean n = (
                ( (x2==x1+1) && (y2==y1+2) ) ||     // tepa o'ngga
                ( (x2==x1+2) && (y2==y1+1) ) ||     // o'ng tepa
                ( (x2==x1+2) && (y2==y1-1) ) ||     // o'ng past
                ( (x2==x1+1) && (y2==y1-2) ) ||     // past o'ng
                ( (x2==x1-1) && (y2==y1-2) ) ||     // past chap
                ( (x2==x1-2) && (y2==y1-1) ) ||     // chap past
                ( (x2==x1-2) && (y2==y1+1) ) ||     // chap tepa
                ( (x2==x1-1) && (y2==y1+2) )        // tepa chap
                );
        System.out.println(n);
    }
}
