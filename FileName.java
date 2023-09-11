import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count=0;
        sc.nextLine();

        String str = sc.nextLine();

        for(int i=0;i<str.length()-2;i++)
        {
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x' && str.charAt(i+2) == 'x')
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
