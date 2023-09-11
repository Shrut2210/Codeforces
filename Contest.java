import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        a = Math.max(((3*a)/10), (a-(a*c/250)));
        b = Math.max(((3*b)/10), (b-(b*d/250)));

        if(a>b)
        {
            System.out.println("Misha");
        }
        else if(a<b)
        {
            System.out.println("Vasya");
        }
        else
        {
            System.out.println("Tie");
        }

    }
}
