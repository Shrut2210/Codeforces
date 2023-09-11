import java.util.Scanner;

public class MaxTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        int max = 1;

        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<=0;j++)
            {
                ar[i][j] = 1;
                ar[j][i] = 1;
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j = 1;j<n;j++)
            {
                ar[i][j] = ar[i-1][j] + ar[i][j-1];
                
                if(max < ar[i][j])
                {
                    max = ar[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
