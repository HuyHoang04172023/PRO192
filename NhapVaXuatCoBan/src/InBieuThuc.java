
import java.util.Scanner;

public class InBieuThuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t = sc.nextInt();
        long result1 = (long) x + y + z + t;
        long result2 = (long) x - y + (long)z * t;
        System.out.println(y + "," + z + "," + x + "," + t);
        System.out.println(result1);
        System.out.println(result2);
    }

}
