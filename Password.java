import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0,cap=0,sm=0,digit=0;

        if(str.length() >= 5)
        {
            count++;
        }

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                cap = 1;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                sm = 1;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                digit = 1;
            }
        }

        if(cap == 1 && sm == 1 && digit == 1 && count == 1)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Too weak");
        }
    }
}
