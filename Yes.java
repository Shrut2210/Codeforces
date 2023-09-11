import java.util.Scanner;

public class Yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++)
        {
            String str = sc.nextLine();
            int j = 0;
            while(j<str.length()-2)
            {
                if(str.charAt(j) == 'Y' && str.charAt(j+1) == 'e' && str.charAt(j+2) == 's' ||
                str.charAt(j) == 's' && str.charAt(j+1) == 'Y' && str.charAt(j+2) == 'e' || 
                str.charAt(j) == 'e' && str.charAt(j+1) == 's' && str.charAt(j+2) == 'Y')
                {
                }
                else
                {
                    System.out.println("NO");
                    break;
                }

                j++;
            }

            if(str.length()-j == 2)
            {
                if(str.charAt(j) == 'Y' && str.charAt(j+1) == 'e'||
                str.charAt(j) == 's' && str.charAt(j+1) == 'Y'|| 
                str.charAt(j) == 'e' && str.charAt(j+1) == 's')
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else if(str.length()-j == 1)
            {
                if(str.charAt(j) == 'e'|| str.charAt(j) == 'Y'|| str.charAt(j) == 's')
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
}
