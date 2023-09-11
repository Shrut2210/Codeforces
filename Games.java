import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[][] ar = new int[t][2];

        for(int i=0;i<t;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for(int i=0;i<t;i++)
        {
            for(int j=i+1;j<t;j++)
            {
                if(ar[i][0] == ar[j][1])
                {
                    count++;
                }
                if(ar[i][1] == ar[j][0])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
