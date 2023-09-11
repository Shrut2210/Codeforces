import java.util.*;

public class Holiday
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int max = 0;
		int[] ar = new int[n];

		for(int i = 0;i<n;i++)
		{
			ar[i] = sc.nextInt();

			if(max < ar[i])
			{
				max = ar[i];
			}
		}

		for(int i = 0;i<n;i++)
		{
			sum += max-ar[i];
		}

		System.out.println(sum);
	}
}