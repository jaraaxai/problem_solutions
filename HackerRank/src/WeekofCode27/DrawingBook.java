package WeekofCode27;

import java.util.Scanner;

/**
 * Created by 985524 on 12/19/2016.
 */
public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int a = p/2;
        int b = n-p;
        if(b == 0){
            b = 0;
        }else if(n % 2 == 1){
            if(b < 2){
                b = 0;
            }else{
                b = b/2;
            }
        }else{
            if(b % 2 == 0){
                b = b/2;
            }else{
                b = b/2;
                b++;
            }
        }
        if(a>b){ a = b;}
        System.out.println(a);
    }
}
