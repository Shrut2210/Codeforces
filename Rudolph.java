import java.util.Scanner;

public class Rudolph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++)
        {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String str3 = sc.nextLine();

            if(str1.charAt(0) == '+' && str1.charAt(1) == '+' && str1.charAt(2) == '+' || 
            str1.charAt(0) == '+' && str2.charAt(0) == '+' && str3.charAt(0) == '+' ||
            str1.charAt(0) == '+' && str2.charAt(1) == '+' && str3.charAt(2) == '+' ||
            str1.charAt(1) == '+' && str2.charAt(1) == '+' && str3.charAt(1) == '+' ||
            str2.charAt(1) == '+' && str2.charAt(0) == '+' && str2.charAt(2) == '+' ||
            str3.charAt(0) == '+' && str3.charAt(1) == '+' && str3.charAt(2) == '+' ||
            str1.charAt(2) == '+' && str2.charAt(1) == '+' && str3.charAt(0) == '+' ||
            str1.charAt(2) == '+' && str2.charAt(2) == '+' && str3.charAt(2) == '+')
            {
                System.out.println("+");
            }
            else if(str1.charAt(0) == 'O' && str1.charAt(1) == 'O' && str1.charAt(2) == 'O' || 
            str1.charAt(0) == 'O' && str2.charAt(0) == 'O' && str3.charAt(0) == 'O' ||
            str1.charAt(0) == 'O' && str2.charAt(1) == 'O' && str3.charAt(2) == 'O' ||
            str1.charAt(1) == 'O' && str2.charAt(1) == 'O' && str3.charAt(1) == 'O' ||
            str2.charAt(1) == 'O' && str2.charAt(0) == 'O' && str2.charAt(2) == 'O' ||
            str3.charAt(0) == 'O' && str3.charAt(1) == 'O' && str3.charAt(2) == 'O' ||
            str1.charAt(2) == 'O' && str2.charAt(1) == 'O' && str3.charAt(0) == 'O' ||
            str1.charAt(2) == 'O' && str2.charAt(2) == 'O' && str3.charAt(2) == 'O')
            {
                System.out.println("O");
            }
            else if(str1.charAt(0) == 'X' && str1.charAt(1) == 'X' && str1.charAt(2) == 'X' || 
            str1.charAt(0) == 'X' && str2.charAt(0) == 'X' && str3.charAt(0) == 'X' ||
            str1.charAt(0) == 'X' && str2.charAt(1) == 'X' && str3.charAt(2) == 'X' ||
            str1.charAt(1) == 'X' && str2.charAt(1) == 'X' && str3.charAt(1) == 'X' ||
            str2.charAt(1) == 'X' && str2.charAt(0) == 'X' && str2.charAt(2) == 'X' ||
            str3.charAt(0) == 'X' && str3.charAt(1) == 'X' && str3.charAt(2) == 'X' ||
            str1.charAt(2) == 'X' && str2.charAt(1) == 'X' && str3.charAt(0) == 'X' ||
            str1.charAt(2) == 'X' && str2.charAt(2) == 'X' && str3.charAt(2) == 'X')
            {
                System.out.println("X");
            }
            else
            {
                System.out.println("DRAW");
            }
        }
    }
}
