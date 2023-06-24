
import java.util.Scanner;




public class InCacBien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long l = sc.nextLong();
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        boolean b = sc.nextBoolean();
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.9f\n",d);
        System.out.println(b);
    }
}
