import java.util.Scanner;
public class boolean37 {
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
                ( (x1==x2) && (y2==y1+1) )   ||   // tepaga yurish
                ( (x1==x2) && (y2==y1-1) )   ||   // pastga yurish
                ( (x2==x1+1) && (y1==y2) )   ||   // o'nga yurish
                ( (x2==x1-1) && (y1==y2) )   ||   // chapga yurish
                ( (x2==x1+1) && (y2==y1+1) ) ||   // o'ng qo'l tepaga
                ( (x2==x1-1) && (y2==y1-1) ) ||   // chap qo'l pastga
                ( (x2==x1-1) && (y2==y1+1) ) ||   // chap qo'l tepaga
                ( (x2==x1+1) && (y2==y1-1) )      // o'ng qo'l pastga
                );
        System.out.println(n);
    }
}
