import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            int[] arr = new int[x];

            for(int j=0;j<arr.length;j++)
            {
                arr[j] = sc.nextInt();
            }

            int count=0;
                for(int j=0;j<arr.length;j++)
                {
                    int temp = arr[0];
                    for(int k=j+1;k<arr.length;k++)
                    {
                        if(arr[j]>arr[k])
                        {
                            temp = arr[j];
                            arr[j] = arr[k];
                            arr[k] = temp;
                        }
                    }
                }

                for(int j=0;j<arr.length-1;j++)
                {
                    if(arr[j]!=arr[j+1])
                    {
                        count++;
                    }
                }

            if(count == (x-1))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
