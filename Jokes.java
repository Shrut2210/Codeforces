import java.util.*;

public class Jokes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int count=0;

        String d = a+b;

        for(int i=0;i<d.length();i++)
        {
            int flag = 0;
            for(int j=0;j<c.length() && flag == 0;j++)
            {
                if(d.charAt(i) == c.charAt(j))
                {
                    count++;
                    flag = 1;
                }
            }
        }

        if(count == c.length() && (c.length() == d.length()))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
