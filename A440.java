import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class A440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n-1;i++)
        {
            arr.add(sc.nextInt());
        }

        arr.sort(Comparator.naturalOrder());
        arr.add(0);

        for(int i=0;i<n;i++)
        {
            if((i+1) != arr.get(i))
            {
                System.out.println((i+1));
                return;
            }
        }
    }
}
