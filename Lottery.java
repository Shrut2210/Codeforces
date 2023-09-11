import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=n,count=0;

        while(sum>0)
        {
            if(sum >= 100)
            {
                sum -= 100;
                count++;
            }
            else if(sum >= 20 && sum < 100)
            {
                sum -= 20;
                count++;
            }
            else if(sum >= 10 && sum < 20)
            {
                sum -= 10;
                count++;
            }
            else if(sum >= 5 && sum < 10)
            {
                sum -= 5;
                count++;
            }
            else if(sum >= 1 && sum < 5)
            {
                sum -= 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
