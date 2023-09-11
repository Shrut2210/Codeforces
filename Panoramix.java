import java.util.Scanner;

public class Panoramix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int flag = 0;

        for(int i=n+1;flag == 0 && i<=m;i++)
        {
            flag = 0;
            int count = 0;
            for(int j=2;j<i;j++)
            {
                if(i%j == 0)
                {
                    count++;
                }
            }

            if(count == 0 && i == m)
            {
                System.out.println("YES");
                flag = 1;
                return;
            }
            else if(count == 0 && i != m)
            {
                System.out.println("NO");
                flag = 1;
                return;
            }
        }

        System.out.println("NO");
    }
}
