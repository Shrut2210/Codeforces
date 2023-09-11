import java.util.*;
public class TwoSister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        for(long i=0;i<t;i++)
        {
            long n = sc.nextLong();

            if(n == 1 || n == 2)
            {
                System.out.println("0");
            }
            else if(n%2 == 0)
            {
                System.out.println((n/2)-1);
            }
            else
            {
                System.out.println(n/2);
            }
        }
    }
}
