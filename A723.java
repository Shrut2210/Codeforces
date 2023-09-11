import java.util.*;

public class A723 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int min = Math.min(a,Math.min(b,c));
        int max = Math.max(a,Math.max(b,c));

        System.out.println(max-min);
    }
}