import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            int sum = (a+b+c);
            int max = Math.max(a,b);
            max = Math.max(max,c);

            int ans = n - max*3 - sum;

            if(ans<0)
            {
                System.out.println("NO");
            }
            else
            {
                if(ans%3==0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }

        }
    }
}
