import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ans = new int[m];

        int div = n/m;
        int mod = n%m;

        for(int i=0;i<m;i++)
        {
            ans[i] = div;

            if(mod>0)
            {
                ans[i] = div+1;
                mod--;
            }
        }

        for(int i=0;i<m;i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
