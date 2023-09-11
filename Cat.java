import java.util.Scanner;
public class Cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            sc.nextLine();

            String s = sc.next();
            s = s.toLowerCase();
            int count=0,dcount=0;

            for(int j=0;j<x-1;j++)
            {
                if(s.charAt(j) == 'm' && s.charAt(j+1) == 'e')
                {
                    count++;
                }
                else if(s.charAt(j) == 'e' && s.charAt(j+1) == 'o')
                {
                    count++;
                }
                else if(s.charAt(j) == 'o' && s.charAt(j+1) == 'w')
                {
                    count++;
                }
                else if(s.charAt(j) != s.charAt(j+1))
                {
                    dcount++;
                }
            }

            if(count == 3 && dcount == 0)
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
