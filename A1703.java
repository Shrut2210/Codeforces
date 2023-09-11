import java.util.*;

public class A1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            String s = sc.nextLine();
            int x = ("Yes").compareToIgnoreCase(s);

            if(x==0)
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
