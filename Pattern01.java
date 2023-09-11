import java.util.*;

public class Pattern01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int x = n;
        int a = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                while (x > 0) {
                    if (i == 1 || i == 2 * x - 1 || j == 1 || j == 2 * x - 1) {
                        System.out.print(x);
                    } else {
                        x--;
                        a++;
                    }
                }
            }
            System.out.println();
        }
    }
}