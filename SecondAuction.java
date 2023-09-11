import java.util.Scanner;

public class SecondAuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];
        int max = 0;
        int smax = 0;
        int index = 0;

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();

            if(ar[i] > max)
            {
                max = ar[i];
                index = i+1; 
            }
        }

        for(int i=0;i<n;i++)
        {
            if(ar[i] == max)
            {
                continue;
            }
            else
            {
                if(ar[i] > smax)
                {
                    smax = ar[i];
                }
            }
        }

        System.out.println(index + " " + smax);

    }
}
