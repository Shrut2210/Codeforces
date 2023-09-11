import java.util.*;

public class OddSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0;i<t;i++)
		{
			int n = sc.nextInt();
			int[] ar = new int[n];
			int sum = 0;

			for(int j=0;j<n;j++)
			{
				ar[j] = sc.nextInt();

				sum += ar[j];
			}

			if(sum%2 == 0)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}