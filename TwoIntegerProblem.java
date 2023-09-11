import java.util.Scanner;

public class TwoIntegerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int k;

            k = Math.abs(a-b);

            if(a == b)
            {
                System.out.println("0");
            }
            else if(k%10 == 0)
            {
                System.out.println((k/10));
            }
            else
            {
                System.out.println((k/10)+1);
            }
        }
    }
}
