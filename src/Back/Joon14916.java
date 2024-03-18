package Back;

import java.util.Scanner;

public class Joon14916 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;

        while(n>0){
            if(n % 5 == 0){
                System.out.println(n/5 + max);
                return;
            }
            n -=2;
            max++;
            if(n==0){
                System.out.println(max);
                return;
            }
        }
        System.out.println(-1);

    }
}
