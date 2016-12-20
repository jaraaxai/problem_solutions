package WeekofCode27;

import java.util.Scanner;

/**
 * Created by 985524 on 12/20/2016.
 */
public class TailorShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        int[] k = new int[100000];
        long sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            int key;
            if(a[a_i] % p == 0){
                key = a[a_i] / p;
            }else{
                key = a[a_i] / p + 1;
            }
            while(true){
                if(k[key] == 0){
                    k[key] = 1;
                    break;
                }
                key++;
            }
            sum+=key;
        }
        System.out.println(sum);
    }
}
