import java.util.Scanner;

public class Kingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        long x = (int)n;

        if(x%10 == 9)
        {
            System.out.println("GOTO Vasilisa.");
            return;
        }

        if(n-x >= 0.5)
        {
            x++;
        }

        System.out.println(x);
    }
}
