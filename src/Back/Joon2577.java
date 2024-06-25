package Back;

import java.util.Scanner;

public class Joon2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[3];
        int sum = 0;
        int[] num = new int[10];

        for(int i=0; i<3; i++){
            input[i] = scanner.nextInt();
        }

        sum = input[0] * input[1] * input[2];

        int i=10;
        while(i< sum){
            num[(sum % i) / (i/10) ]++;
            i*=10;
        }
        num[(sum % i) / (i/10) ]++;


        for (int j = 0; j < 10; j++) {
            System.out.println(num[j]);
        }
    }

}
