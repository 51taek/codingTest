package Back;

import java.util.Scanner;

public class Joon11501 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //테스트 수
        int testNum = scanner.nextInt();

        int[] day = new int[testNum];
        int[] result = new int[testNum];

        for(int i=0;i<testNum;i++){
            day[i] = scanner.nextInt();
            int[] stock = new int[day[i]];
            int max = 0;
            for(int j=0; j<day[i];j++){
                stock[j] = scanner.nextInt();
            }
            for(int n=day[i]-1;n>=0;n--){
                if(stock[n] > max){
                    max = stock[n];
                }
                else {
                    result[i] += (max - stock[n]);
                }
            }
        }
        for(int t=0;t<testNum;t++){
            System.out.println(result[t]);
        }
    }
}
