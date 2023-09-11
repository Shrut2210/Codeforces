import java.util.Scanner;

public class RoomLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a,b,c,d,e,x,y;
        int max = Integer.MIN_VALUE;
        String str;
        String name = "";
        sc.nextLine();

        for(int i=0;i<n;i++)
        {
            int total = 0;
            str = sc.next();
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();

            total = x*100 + y*(-50) + a + b + c + d + e;

            if(max <= total)
            {
                name = str;
                max = total;
            }
            sc.nextLine();
        }
        System.out.println(name);
    }
}
