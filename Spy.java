import java.util.*;
public class Spy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int[] ar = new int[n];
			int f=1;

			for(int j=0;j<n;j++)
			{
				ar[j] = sc.nextInt();
			}

			for(int j=0;j<n-2 && f==1;j++)
			{
				if(ar[j] != ar[j+1] && ar[j+1] != ar[j+2])
				{
					System.out.println(j+2);
					f = 0;
				}
				else if(ar[j] != ar[j+1] && ar[j+1] == ar[j+2])
				{
					System.out.println(j+1);
					f = 0;
				}
			}

			if(f == 1)
			{
				System.out.println(n);
			}
		}
	}
}