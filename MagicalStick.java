import java.util.Scanner;

public class MagicalStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            long a = sc.nextLong();

            if(a%2==0)
            {
                System.out.println(a/2);
            }
            else
            {
                System.out.println((a/2)+1);
            }
        }
    }
}
