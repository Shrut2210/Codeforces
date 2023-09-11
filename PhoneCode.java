import java.util.Scanner;

public class PhoneCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        for(int i=0;i<n;i++)
        {
            str[i] = sc.nextLine();
        }

        int len = 0,count=0;

        for(int i=0;i<str[0].length();i++)
        {
            count = 0;
            for(int j=0;j<n-1;j++)
            {
                if(str[j].charAt(i) == str[j+1].charAt(i))
                {
                    count++;
                }
                else
                {
                    break;
                }
            }

            if(count == n-1)
            {
                len++;
            }
            else
            {
                break;
            } 
        }

        System.out.println(len);
    }
}
