import java.util.Scanner;
class boolean39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x1=");
        int x1=input.nextInt();
        System.out.print("y1=");
        int y1=input.nextInt();
        System.out.print("x2=");
        int x2=input.nextInt();
        System.out.print("y2=");
        int y2=input.nextInt();
        boolean shart = (x1==x2 || y1==y2) || (Math.abs(x1-x2)==Math.abs(y1-y2));
        System.out.println(shart);
    }
}
