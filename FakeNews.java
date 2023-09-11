import java.util.Scanner;

public class FakeNews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = "heidi";
        int count = 0,index = 0;

        for(int i=0;i<s.length() && index < 5;i++)
        {
            if(s.charAt(i) == ans.charAt(index))
            {
                count++;
                index++;
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
