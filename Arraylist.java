import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> shruti = new ArrayList<>();

        shruti.add(sc.nextInt());
        shruti.add(sc.nextInt());
        shruti.add(sc.nextInt());
        shruti.add(sc.nextInt());
        shruti.add(sc.nextInt());

        shruti.sort(Comparator.naturalOrder());
        BigInteger min = BigInteger.valueOf(shruti.get(0)) + BigInteger.valueOf(shruti.get(1)) + BigInteger.valueOf(shruti.get(2)) + BigInteger.valueOf(shruti.get(3));
        BigInteger max = BigInteger.valueOf(shruti.get(4)) + BigInteger.valueOf(shruti.get(1)) + BigInteger.valueOf(shruti.get(2)) + BigInteger.valueOf(shruti.get(3));

        System.out.println(min + " " + max);

    }
}
