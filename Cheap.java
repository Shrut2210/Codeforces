import java.util.Scanner;

public class Cheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(m*a > b)
        {
            int sum = (n%m)*a;

            if(sum > b)
            {
                System.out.println(n / m * b + b);
            }
            else
            {
                System.out.println(n / m * b + sum);
            }
        }
        else
        {
            System.out.println(n * a);
        }
    }
}
