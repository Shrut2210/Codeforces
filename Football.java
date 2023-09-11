import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] ar = new String[n];
        int count = 0;
        String ans = "";

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextLine();
        }

        if(n==1)
        {
            System.out.println(ar[0]);
        }
        else
        {

            for(int i=0;i<n;i++)
            {
                if(ar[0].equals(ar[i]))
                {
                    count++;
                }
                else
                {
                    ans = ar[i];
                }
            }

            if(count > (n-count))
            {
                System.out.println(ar[0]);
            }
            else
            {
                System.out.println(ans);
            }
        }
    }
}
