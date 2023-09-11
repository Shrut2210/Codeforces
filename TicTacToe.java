import java.util.*;

public class TicTacToe
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[9];
        sc.nextLine();

        for(int i=0;i<9;i++)
        {
            arr[i] = '-';
        }

        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        for(int i=3;i<6;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        for(int i=6;i<9;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.print("\n");

        System.out.println("Player 1 sign : ");
        char sign1 = sc.next().charAt(0);
        System.out.println("Player 2 sign : ");
        char sign2 = sc.next().charAt(0);


        int t=0,flag=0,index=0;
        while(t<4)
        {

            System.out.println("For Player => 1");
            System.out.println("Enter index : ");
            index = sc.nextInt();
            sc.nextLine();

            arr[index] = sign1;

            System.out.println("For Player => 2");
            System.out.println("Enter index : ");
            index = sc.nextInt();
            sc.nextLine();

            arr[index] = sign2;

                for(int i=0;i<3;i++)
                {
                    System.out.print(arr[i]);
                }
                System.out.print("\n");
                for(int i=3;i<6;i++)
                {
                    System.out.print(arr[i]);
                }
                System.out.print("\n");
                for(int i=6;i<9;i++)
                {
                    System.out.print(arr[i]);
                }
                System.out.print("\n");

            
            if(arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == 'o' || 
            arr[0] == arr[3] && arr[3] == arr[6] && arr[0] == 'o' || 
            arr[0] == arr[4] && arr[4] == arr[8] && arr[0] == 'o' || 
            arr[8] == arr[5] && arr[5] == arr[2] && arr[8] == 'o' || 
            arr[8] == arr[7] && arr[7] == arr[6] && arr[8] == 'o' || 
            arr[1] == arr[4] && arr[4] == arr[7] && arr[4] == 'o' || 
            arr[3] == arr[4] && arr[4] == arr[5] && arr[4] == 'o' || 
            arr[2] == arr[4] && arr[4] == arr[6] && arr[4] == 'o')
            {
                if(sign1 == 'o')
                {
                    System.out.println("Player 1 won...");
                    return;
                }
                else
                {
                    System.out.println("Player 2 won...");
                    return;
                }
            }

            else if(
                arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == 'x' ||
            arr[0] == arr[3] && arr[3] == arr[6] && arr[0] == 'x' ||
            arr[0] == arr[4] && arr[4] == arr[8] && arr[0] == 'x' ||
            arr[8] == arr[5] && arr[5] == arr[2] && arr[8] == 'x' ||
            arr[8] == arr[7] && arr[7] == arr[6] && arr[8] == 'x' ||
            arr[1] == arr[4] && arr[4] == arr[7] && arr[4] == 'x' ||
            arr[3] == arr[4] && arr[4] == arr[5] && arr[4] == 'x' ||
            arr[2] == arr[4] && arr[4] == arr[6] && arr[4] == 'x'
            )
            {
                if(sign1 == 'x')
                {
                    System.out.println("Player 1 won...");
                    return;
                }
                else
                {
                    System.out.println("Player 2 won...");
                    return;
                }
            }
            
            else
            {
                System.out.println("Go Ahead...");
                flag = 1;
            }

            t++;
        }

        if(flag == 1)
        {
            System.out.println("Both Looser...");
        }
    }
}