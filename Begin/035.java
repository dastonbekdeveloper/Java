import java.util.Scanner;
public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" v(q) = ");
        float vq = scanner.nextFloat();
        System.out.print(" v(o) = ");
        float vo = scanner.nextFloat();
        System.out.print(" T(o'qim buylab) = ");
        float t1 = scanner.nextFloat();
        System.out.print(" T(o'qimga qarshi) = ");
        float t2 = scanner.nextFloat();
        float s = (vq-vo)*t1+(vq+vo)*t2;
        System.out.println(" S = " + s + " km");
    }
}
