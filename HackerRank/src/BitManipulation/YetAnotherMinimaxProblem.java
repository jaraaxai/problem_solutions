package BitManipulation;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class YetAnotherMinimaxProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, max2 = 0;
        int arr[] = new int[n];
        arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            int t = arr[i-1] ^ arr[i];
            if(t>max){ max2 = max; max = t;}
        }
        System.out.println(max2);
    }
}
