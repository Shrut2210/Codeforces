import java.util.*;

public class A282 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        String str1 = "x++";
        String str2 = "++x";
        String str3 = "x--";
        String str4 = "--x";

        String str = new String();

        int x=0;
        for(int i=1;i<=n+1;i++)
        {
            str = scn.nextLine();

            if(str.equals(str1))
            {
                x++;
            }
            else if(str.equals(str3))
            {
               x--;
            }
            else if(str.equals(str2))
            {
               ++x;
            }
            else if(str.equals(str4))
            {
                --x;
            }
         }

         System.out.printf("%d", x);

    }
}