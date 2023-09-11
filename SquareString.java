import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++)
        {
            String str = sc.nextLine();

            int count=0;
            for(int j=0,k=str.length()/2;j<str.length()/2 && k<str.length(); j++,k++)
            {
                if(str.charAt(j) == str.charAt(k))
                {
                    count++;
                }
            }

            if(str.length()%2 != 0)
            {
                System.out.println("NO");
            }

            else if(count == str.length()/2)
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
