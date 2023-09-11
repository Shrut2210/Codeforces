import java.util.Scanner;

public class Rush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int k = sc.nextInt();

        int[][] ar = new int[n][2];

        int max = 0;
        int id = 0;

        for(int i=0;i<n;i++)
        {
            ar[i][0] = sc.nextInt();            
            ar[i][1] = sc.nextInt();

            if(ar[i][1] >= max)
            {
                max = ar[i][1];
                id = i;
            }
        }

        if(max == k)
        {
            System.out.println(ar[id][0]);
        }
        else
        {
            max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(ar[i][1] > k)
                {
                    if((ar[i][0]-ar[i][1]+k) >= max)
                    {
                        max = ar[i][0]-ar[i][1]+k;
                    }
                }
                else
                {
                    if(ar[i][0] > max)
                    {
                        max = ar[i][0];
                    }
                }
            }

            System.out.println(max);
        }
    }
}
