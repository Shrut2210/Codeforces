import java.util.*;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String h = "hello";
        int j=0;
        int count=0;

        for(int i=0;i<s.length() && j<5;i++)
        {
            if(s.charAt(i) == h.charAt(j))
            {
                j++;
                count++;
            }
        }

        if(count == 5)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
