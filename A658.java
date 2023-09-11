import java.util.Scanner;

public class A658 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int lim=0,sam=0,timelim=0,timesam=0;

        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }

        for(int i=0,j=n-1;i<n && j>=0;i++,j--)
        {
            timelim += arr2[i];
            timesam += arr2[j];

            lim += Math.max(0,(arr1[i] - c*timelim));
            sam += Math.max(0,(arr1[j] - c*timesam));
        }

        if(lim>sam)
        {
            System.out.print("Limak");
        }
        else if(lim<sam)
        {
            System.out.print("Radewoosh");
        }
        else
        {
            System.out.print("Tie");
        }
    }
}
