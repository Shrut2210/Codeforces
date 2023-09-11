import java.util.Scanner;

public class BadP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int count = 0,min=0;

            for(int j=0;j<n;j++)
            {
                ar[j] = sc.nextInt();
            }

            min = ar[n-1];

            for(int j=n-2;j>=0;j--)
            {
                if(min < ar[j])
                {
                    count++;
                }

                min = Math.min(min,ar[j]);
            }

            System.out.println(count);
        }
    }
}
