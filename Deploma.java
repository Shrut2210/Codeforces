import java.util.Scanner;

public class Deploma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long[] ans = new long[3];

        if(m >= n)
        {
            ans[0] = 0;
            ans[1] = 0;
            ans[2] = n;
        }
        else
        {
            ans[0] = (n/2)/(1 + m);
            ans[1] = m*ans[0];
            ans[2] = n-ans[0]-ans[1];
        }

        System.out.print(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}
