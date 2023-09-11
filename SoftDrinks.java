import java.util.Scanner;

public class SoftDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int pl = sc.nextInt();

        int x = k*l;
        x = x/nl;
        int y = c*d;
        int z = p/pl;

        int s = Math.min(x,y);
        s = Math.min(s,z);
        System.out.println(s/n);
    }
}
