import java.util.*;

public class Borz {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i=0;
        while(str.length() > i)
        {
            if(str.charAt(i) == '-' && str.charAt(i+1) == '-')
            {
                System.out.print("2");
                i += 2;
            }
            else if(str.charAt(i) == '-' && str.charAt(i+1) == '.')
            {
                System.out.print("1");
                i += 2;
            }
            else
            {
                System.out.print("0");
                i++;
            }
        }
    }
}
