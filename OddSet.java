import java.util.*;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int[] ar = new int[2*n];
            int so = 0;
            int se = 0;
            int sum = 0;

            for(int j=0;j<2*n;j++)
            {
                ar[j] = sc.nextInt();

                sum += ar[j];

                if(ar[j]%2 == 0)
                {
                    se++;
                }
                else
                {
                    so++;
                }
            }

            if(sum % 2 == 0)
            {
                if(se == so)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
            else
            {
                if(se == so)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
    }
}
