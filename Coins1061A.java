import java.util.Scanner;

public class Coins1061A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        if(s%n == 0)
        {
            System.out.println(s/n);
        }
        else
        {
            System.out.println((s/n)+1);
        }
    }
}
