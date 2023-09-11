import java.util.Scanner;

public class FrogJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            long sum = 0;

            

            if(a == 1 && b == 1)
            {
                if(k%2 == 0)
                {
                    System.out.println("0");
                }
                else
                {
                    System.out.println("1");
                }
            }
            else
            {
                if(k%2==0)
                {
                    System.out.println((k/2)*(a-b));
                }
                else
                {
                    System.out.println(((k/2)+1)*a-((k/2)*b));
                }
            }
        }
    }
}
