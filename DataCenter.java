import java.util.*;

public class DataCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sqrt = Math.sqrt(n);
        double floor = Math.floor(sqrt);
        ArrayList<Integer> sq = new ArrayList<>();

        if(sqrt != floor )
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i == 0)
                {
                    sq.add(i);
                }
            }

            if(sq.size() == 2)
            {
                System.out.println(2*(1+sq.get(1)));
                    return;
            }

            else
            {
            
                for(int i=0,j=sq.size()-1;i<sq.size()-1 && j>=0;i++,j--)
                {
                    if(sq.get(i)+sq.get(j) < sq.get(i+1)+sq.get(j-1))
                    {
                        System.out.println(2*(sq.get(i)+sq.get(j)));
                        return;
                    }
                }
            }
        }

        else
        {
            System.out.println((int)(4*Math.sqrt(n)));
        }
    }
}
