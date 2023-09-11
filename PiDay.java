import java.util.*;

public class PiDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pi = "3141592653589793238462643383279";
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++)
        {
        	String n = sc.nextLine();
        	int count=0;

        	for(int j=0,k=0;j<pi.length() && k<n.length();j++,k++)
        	{
        		if(pi.charAt(j) == n.charAt(k))
        		{
        			count++;
        		}
        		else
        		{
        			break;
        		}
        	}
        	System.out.println(count);
        }
    }
}
