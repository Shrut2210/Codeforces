import java.util.Scanner;

public class MinLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int min = MinLCM.LCM(1,(n-1));
            int mina = 0;
            int minb = 0;

            for(int j=1,k=(n-1);j<=(n+1)/2&& k>=(n+1)/2;j++,k--)
            {
                if(min>=MinLCM.LCM(j,k))
                {
                    min = MinLCM.LCM(j,k);
                    mina = j;
                    minb = k;
                }
            }

            System.out.println(mina + " " + minb);
        }


    }

    static int LCM(int a, int b)
    {
        int hcf,lcm;
        int temp;
        int num1=a;
        int num2=b;

        while(num2!=0){
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		hcf=num1;
		lcm=(a*b)/hcf;

        return lcm;

    }
}
