import java.util.Scanner;

public class Playoff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int[] s = new int[4];
            int k = 0;
            int l = 0;
            int abm = 0;
            int cdm = 0;

            for(int j=0;j<4;j++)
            {
                s[j] = sc.nextInt();
            }

            if(s[0]>s[1])
            {
                abm = s[0];
                k=0;
            }
            else
            {
                abm = s[1];
                k=1;
            }

            if(s[2]>s[3])
            {
                cdm = s[2];
                l=2;
            }
            else
            {
                cdm = s[3];
                l=3;
            }

            if(k == 0 && l == 2 && abm > s[3] && cdm > s[1])
            {
                System.out.println("YES");
            }
            else if(k==0 && l == 3 && abm > s[2] && cdm > s[1])
            {
                System.out.println("YES");
            }
            else if(k == 1 && l == 2 && abm > s[3] && cdm > s[0])
            {
                System.out.println("YES");
            }
            else if(k == 1 && l == 3 && abm > s[2] && cdm > s[0])
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}
