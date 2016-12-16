package BitManipulation;

import java.util.Scanner;

/**
 * Created by 985524 on 12/16/2016.
 */
public class FlippingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long num = sc.nextLong();

            long maxValue = (long)Math.pow(2,32)-1;
            System.out.println(num ^ maxValue);
        }
    }
}
