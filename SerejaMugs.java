import java.util.Scanner;

public class SerejaMugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] ar = new int[n];

        int count=0;
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();

            if(ar[i] > max)
            {
                max = ar[i];
                index = i;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(i != index)
            {
                count += ar[i];
            }
        }

        if(count <= s)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
