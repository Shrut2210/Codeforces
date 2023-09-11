import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        int ans = 0;

        for(int i=0;i<n;i++)
        {
            String str = sc.nextLine();
            String str2 = sc.nextLine();
            int val1 = 0;
            int val2 = 0;
            ans = 0;

            for(int j=0;j<str2.length()-1;j++)
            {
                val1 = 0;
                val2 = 0;
                for(int k=0;k<str.length();k++)
                {
                    if(str2.charAt(j) == str.charAt(k))
                    {
                        val1 = k+1;
                        break;
                    }
                }

                for(int k=0;k<str.length();k++)
                {
                    if(str2.charAt(j+1) == str.charAt(k))
                    {
                        val2 = k+1;
                        break;
                    }
                }


                ans += Math.abs(val1-val2);
            }

            System.out.println(ans);
        }
    }
}
