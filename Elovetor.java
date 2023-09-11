import java.util.Scanner;
public class Elovetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();

        int sum1 = Math.abs((x-y)*t1);

        int sum2 = Math.abs((x-z)*t2);
        sum2 += Math.abs((x-y)*t2) + 3*t3;

        if(sum1 >= sum2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
