package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Joon3273 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Boolean[] occur = new Boolean[2000001];
        Arrays.fill(occur, false);
        int ans = 0;

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if(sum-arr[i] > 0 && occur[sum-arr[i]]){
                ans++;
            }
            occur[arr[i]] = true;
        }
        System.out.println(ans);

    }
}
