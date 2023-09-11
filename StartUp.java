import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int total = 0;

        String str2 = "";

        for(int i=str.length()-1;i>=0;i--)
        {
            str2 += str.charAt(i);
            if(str.charAt(i) == 'A' || str.charAt(i) == 'H' || str.charAt(i) == 'I' || str.charAt(i) == 'M' || str.charAt(i) == 'O' || str.charAt(i) == 'Y' || str.charAt(i) == 'X' || str.charAt(i) == 'W' || str.charAt(i) == 'U' || str.charAt(i) == 'V' || str.charAt(i) == 'T')
            {
                total++;
            } 
        }

        if(str.equals(str2) && total == str.length())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
