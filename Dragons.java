import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        int flag = 0;

        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(s>x)
            {
                s += y;
                flag++;
            }
            else
            {
                System.out.println("NO");
            }
        }

        if(n == flag)
        {
            System.out.println("YES");
        }
    }
}
