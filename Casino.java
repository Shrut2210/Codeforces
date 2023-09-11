import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] ar = new int[n][m];

            for(int j=0;j<n;j++)
            {
                for(int k=0;k<m;k++)
                {
                    ar[j][k] = sc.nextInt();
                }
            }

            int sum = 0;

            for(int j=0;j<n-1;j++)
            {
                for(int k=j+1,l=0;k<n && l<m;l++)
                {
                    sum += Math.abs(ar[j][l] - ar[k][l]);

                    if(l == m-1)
                    {
                        l = -1;
                        k++;
                    }
                }
            }

            if(n == 1)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(sum);
            }
        }
    }
}
