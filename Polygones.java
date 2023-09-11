import java.util.Scanner;

public class Polygones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        sc.nextLine();

        for(int i=1;i<=n;i++)
        {
            String s = sc.next();

            if(s.equals("Tetrahedron"))
            {
                sum += 4;
            }
            else if(s.equals("Cube"))
            {
                sum += 6;
            }
            else if(s.equals("Octahedron"))
            {
                sum += 8;
            }
            else if(s.equals("Dodecahedron"))
            {
                sum += 12;
            }
            else if(s.equals("Icosahedron"))
            {
                sum += 20;
            }
        }

        System.out.println(sum);
    }
}
