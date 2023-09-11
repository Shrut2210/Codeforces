import java.util.Scanner;

public class GoodMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        long ans = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j] = sc.nextInt();

                if(i == j)
                {
                    ans+= ar[i][j];
                }
                else if((i+j) == n-1)
                {
                    ans += ar[i][j];
                }
                else if( i == (n-1)/2 || j == (n-1)/2)
                {
                    ans += ar[i][j];
                }
            }
        }

        System.out.print((ans));
    }
}
