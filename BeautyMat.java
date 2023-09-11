import java.util.Scanner;

public class BeautyMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ar = new int[5][5];
        int a = 0;
        int b = 0;

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                ar[i][j] = sc.nextInt();

                if(ar[i][j] == 1)
                {
                    a = i+1;
                    b = j+1;
                }
            }
        }

        int ans2 = 0;
        ans2 = (Math.abs(a-3) + Math.abs(b-3));

        System.out.println(ans2);
    }
}
