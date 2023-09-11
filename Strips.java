import java.util.Scanner;
public class Strips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=n;i++)
        {
            int temp=0;
            String line;

            for(int j=0;j<8;j++)
            {
                line = sc.next();

                if(line.equals("RRRRRRRR"))
                {
                    temp=1;
                }
            }
            if(temp == 1)
            {
                System.out.println("R");
            }
            else
            {
                System.out.println("B");
            }
        }
    }
}
