import java.util.*;
public class BunLover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++)
        {
            long n = sc.nextLong();

            System.out.println((n*n)+n+(n-1)+3);
        }
    }
}
