import java.util.Scanner;

public class VenyaFence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();

            if(arr[i] > k)
            {
                sum += 2;
            }
            else
            {
                sum++;
            }
        }

        System.out.println(sum);
    }
}