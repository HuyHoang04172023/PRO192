
import java.util.Scanner;



public class HamPowVaSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long pow = (long) Math.pow(a, b);
        double sqrt = (double) Math.sqrt(c);
        System.out.println(pow);
        System.out.printf("%.2f\n",sqrt);
    }
}

