import java.util.Scanner;

public class InDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int[] ar = new int[n];

            ar[n-1] = y;

            for(int j=n-2, k=1;j>=0;j--,k++)
            {
                ar[j] = ar[j+1]-k;
            }

            if(ar[0] >= x)
            {
                ar[0] = x;
                for(int l=0;l<n;l++)
                {
                    System.out.print(ar[l] + " ");
                }
            }
            else
            {
                System.out.print("-1");
            }

            System.out.println();
        }
    }
}
