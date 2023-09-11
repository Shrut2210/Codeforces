import java.util.*;

public class Museum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "a" + str;

        int count = 0;

        for(int i=0;i<str2.length()-1;i++)
        {
            count += Math.min(Math.abs(str2.charAt(i)-str2.charAt(i+1)),Math.abs(26-Math.abs(str2.charAt(i)-str2.charAt(i+1))));
        }
        System.out.println(count);
    }
}
