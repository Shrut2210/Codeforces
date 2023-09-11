import java.util.Scanner;

public class Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();

            int a = 0;
            int b = 0;
            int x = 1;

            while(n > 0)
            {
                if(x >= n)
                {
                    a += n;
                    break;
                }
                else
                {
                    a += x;
                    n -= x;
                }

                x += 4;

                if(x >= n)
                {
                    b += n;
                    break;
                }
                else
                {
                    b += x;
                    n -= x;
                }

                x += 4;
            }

            System.out.println(a + " " + b);
        }
    }
}
