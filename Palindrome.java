import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++)
        {
            String s = sc.nextLine();
            int count=0;

            for(int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(j) == s.charAt(j+1))
                {
                    count++;
                }
            }

            if(count == s.length()-1)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(s.length()-1);
            }
        }
    }
}
