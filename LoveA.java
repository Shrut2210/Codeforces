import java.util.Scanner;
public class LoveA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int a = 0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'a')
            {
                a++;
            }
        }

        if(a>(str.length())/2)
        {
            System.out.println(str.length());
        }
        else
        {
            System.out.println((2*a)-1);
        }
    }
}
