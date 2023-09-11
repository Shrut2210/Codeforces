import java.util.*;
public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int count = 0;
            int j = 3;
            while(j<=n)
            {
                j += x;
                count++;
            }

            if(n == 1 || n == 2)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println(count+1);
            }
            
        }
    }
}
