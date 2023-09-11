import java.util.Scanner;

public class Jzzhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ar = new int[n];
        int flag = 0;
        int ans = 0;
        int count = 0;

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();

            if(ar[i] <= m)
            {
                ar[i] = -1;
                count++;
            }
            else
            {
                ar[i] -= m;
                ans = i+1;
                flag = 1;
            }
        } 

        if(count == n)
        {
            System.out.println(n);
        }
        else
        {
            while(flag != 0)
            {
                flag = 0;

                for(int i=0;i<n;i++)
                {
                    if(ar[i] <= m)
                    {
                        ar[i] = -1;
                    }
                    else
                    {
                        ar[i] -= m;
                        ans = i+1;
                        flag = 1;
                    }
                }
            }

            System.out.println(ans);
        }

    }
}
