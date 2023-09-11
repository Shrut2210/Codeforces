import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lap = new int[n][4];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<4;j++)
            {
                lap[i][j] = sc.nextInt();
            }
        }

        int mxs=0;
        int mxr=0;
        int mxd=0;
        int mnc=0;
        int last=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0,k=1,l=2,m=3;j<=0 && k<2 && l<3 && m<4;j++,k++,l++,m++)
            {
                if(mxs <= lap[i][j] && mxr <= lap[i][k] && mxd <= lap[i][l] && mnc >= lap[i][m])
                {
                    mxs = lap[i][j];
                    mxr = lap[i][k];
                    mxd = lap[i][l];
                    mnc = lap[i][m];
                    last = i;
                }
            }
        }

        System.out.println(last);
    }
}
