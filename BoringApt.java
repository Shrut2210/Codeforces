import java.util.Scanner;

public class BoringApt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int ans = 0;
            int n = sc.nextInt();

            if(n%1111 == 0)
            {
                ans += (n/1111)*10;
            }
            else if(n%111 == 0 && n != 111)
            {
                ans += ((n/111)-1)*10;
                ans += 6;
            }
            else if(n%11 == 0 && n != 11)
            {
                ans += ((n/11)-1)*10;
                ans += 3;
            }
            else if(n == 111)
            {
                ans = 6;
            }
            else if(n == 11)
            {
                ans = 3;
            }
            else if(n == 1)
            {
                ans = 1;
            }
            else if(n != 1)
            {
                ans += (n-1)*10;
                ans++;
            }

            System.out.println(ans);
        }
    }
}
