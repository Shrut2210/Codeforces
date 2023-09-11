import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();

            int count = 9;
            for(int k = 10 ; k<=n;k++)
            {
                int j = n;
                int c= 0;
                while(j>0)
                {
                    if(j%10 == 0)
                    {
                        c++;
                    }

                    j = j/10;
                }

                if(c == 1)
                {
                    count++;
                }
            }
        
            if(n <= 9)
            {
                System.out.println(n);
            }
            else
            {
                System.out.println(count);  
            }
        }
    }
}
