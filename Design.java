import java.util.*;

public class Design
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a,b;
		int ca=0;
		int cb=0;

		for(a = 4, b = n-a; a<n && b>3; a++,b--)
		{
			ca = 0;
			cb = 0;
			for(int i = 2; i<a;i++)
			{
				if(a%i == 0)
				{
					ca++;
				}
			}

			for(int i = 2; i<b;i++)
			{
				if(b%i == 0)
				{
					cb++;
				}
			}


			if(ca > 0 && cb > 0)
			{
				System.out.println(a + " " + b);
				return;
			}

		}
	}
}