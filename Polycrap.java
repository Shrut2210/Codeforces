import java.util.*;

public class Polycrap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        for(long i=0;i<t;i++)
        {
            long n = sc.nextLong();
            long min = 0;
            long a=0;
            long b=0;

            for(long j=1;j<n;j++)
            {
                for(long k=1;k<n;k++)
                {
                    if(j+(2*k) == n)
                    {
                        if(Math.abs(j-k) < min)
                        {
                            min = Math.abs(j-k);
                            a = j;
                            b = k;
                        }
                    }
                }
            }

            System.out.println(a + " " + b);
        }
    }
}
