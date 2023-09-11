import java.util.*;
public class RoundSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =0;i<t;i++)
        {
            int n = sc.nextInt();
            int sum=0;
            ArrayList<Integer> ar = new ArrayList<>();
            int y=0;
            int x;
            int count=0;

            while(n>0)
            {
                x = n%10;
                y = x*(int)Math.pow(10,count);

                if(x != 0)
                {
                    ar.add(y);
                    sum++;
                }
                
                n = n/10;
                count++;
            }

            System.out.println(sum);
            for(int j=0;j<ar.size();j++)
            {
                System.out.print(ar.get(j) + " ");
            }
            
        }

    }
}
