import java.util.Scanner;
public class Begin21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" A(x1,y1) - kordinatalarini kiritamiz");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.println(" B(x2,y2) - kordinatalarini kiritamiz");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        System.out.println(" C(x3,y3) - kordinatalarini kiritamiz");
        System.out.print("x3 =");
        int x3 = scanner.nextInt();
        System.out.print("y3 = ");
        int y3 = scanner.nextInt();
        System.out.println( "A(" + x1 + ";" + y1 + ") ");
        System.out.println( "B(" + x2 + ";" + y2 + ")");
        System.out.println( "C(" + x3 + ";" + y3 + ") ");
        double AB = Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
        System.out.println("AB = " + AB);
        double BC = Math.sqrt( (x3-x2)*(x3-x2) + (y3-y2)*(y3-y2) );
        System.out.println("BC = " + BC);
        double AC = Math.sqrt( (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1) );
        System.out.println("AC = " + AC);
        double a = AB; double b = BC ; double c = AC ;
        double P = a+b+c; double p = (a+b+c)/2;
        double s =  Math.sqrt( p*(p-a)*(p-b)*(p-c));
        System.out.println("P = " + P);
        System.out.println("s = " + s);
    }
}
