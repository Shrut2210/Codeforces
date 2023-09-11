import java.util.*;

public class CapsLock
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String temp = "";

        int count=0;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=91)
            {
                count++;
            }
        }

        if(count == (str.length()-1))
        {
            if(str.charAt(0) >= 65 && str.charAt(0) <= 91)
            {
                temp += str.toLowerCase().charAt(0);
            }
            else
            {
                temp += str.toUpperCase().charAt(0);
            }
            for(int i=1;i<str.length();i++)
            {
                temp += str.toLowerCase().charAt(i);
            }
        }
        else
        {
            temp += str;
        }

        System.out.println(temp);
    }
}