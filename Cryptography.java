import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        for(long i=0;i<t;i++)
        {
            long p = sc.nextInt();
            System.out.println(2 + " " + (p-1));
        }
    }    
}
