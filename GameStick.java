import java.util.Scanner;

public class GameStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = n*m;
        int b = 0;

        if(n < m)
        {
            b = a/m;
        }
        else
        {
            b = a/n;
        }

        if(b%2 == 0)
        {
            System.out.println("Malvika");
        }
        else
        {
            System.out.println("Akshat");
        }
    }
}
