import java.util.Scanner;

public class VanyaCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long count = 0;
    	long j = 1;
    	for(long i=1;i<=10000 && j<=n;i++)
    	{
    		j = (i*i + i)/2;
    		if(j>n)
    		{
    			break;
    		}

    		count++;

    		n = n-j;
    	}

    	System.out.println(count);
    }
}
