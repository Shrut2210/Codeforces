import java.util.Scanner;

public class A1671
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++)
        {
            String str = sc.nextLine();
            int a=0,b=0;
            boolean isTrue = true;

            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j) == 'a')
                {
                    a++;
                }
                if(str.charAt(j) == 'b')
                {
                    b++;
                }
                if(str.charAt(j) == 'b' && a>0)
                {
                    if(a==1)
                    {
                        isTrue = false;
                        break;
                    }
                    a=0;
                }
                if(str.charAt(j) == 'a' && b>0)
                {
                    if(b==1)
                    {
                        isTrue = false;
                        break;
                    }
                    b=0;
                }
                if(j == str.length()-1)
                {
                    if(a == 1 || b == 1)
                    {
                        isTrue = false;
                        break;
                    }
                }
            }

            if(isTrue)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }

        // for(int i=1;i<=n;i++)
        // {
        //     int count=0;
        //     Boolean isTrue = true;
        //     String str = sc.nextLine();

        //     for(int j=0;j<str.length();j++)
        //     {
        //         if(str.indexOf("aba") == j ||  str.indexOf("bab") == j || str.indexOf("ba") == (str.length()-2) || str.indexOf("ab") == (str.length()-2) || str.indexOf("ab") == 0 || str.indexOf("ba") == 0 || str.equals("a") || str.equals("b"))
        //         {
        //             isTrue = false;
        //             break;
        //         }
        //         else
        //         {
        //             isTrue = true;
        //         }
        //     }

        // }
    }
}