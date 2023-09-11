import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int count=0;
            sc.nextLine();

            String s1 = sc.next();
            String s2 = sc.next();
            
            String s3 = s1;

            for(int j=t-1;j>=0;j--)
            {
                s3 += s2.charAt(j);
            }

            for(int k=0;k<s3.length()-1;k++)
            {
                if(s3.charAt(k) == s3.charAt(k+1))
                {
                    count++;
                }
            }


            if(count <= 1 )
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
