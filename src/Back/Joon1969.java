package Back;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Joon1969 {
    /**
     * 문제 잘못 이해하고 이상하게 품
     * 의욕은 식었지만 아까워서 못지우겠음;;;;;;;
     * 어쩐지 안되더라
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] arr = new String[n];
        String[][] str = new String[n][m];
        int diff[] = new int[n];
        String[] tar;

        //입력받기
        for(int i=0; i< n; i++){
            arr[i] = scanner.next();
            str[i] = arr[i].split("");
        }

        for(int i=0;i<n;i++){
            diff[i]=0;
            tar = str[i];
            for(int j=0;j<m;j++){
               for(int t=0;t<n;t++){
                   if(!tar[j].equals(str[t][j])){
                       diff[i]++;
                   }
               }
            }
        }
        int min = diff[0];
        int minNum =0;

        for(int i=0;i<n;i++)
        {
            if(diff[i] < min){
                min = diff[i];
                minNum = i;
            }
        }
        for(int i=0;i<n;i++){
            if(diff[i] == minNum){
                if(str[i][0].compareTo(str[minNum][0]) < 0){
                    minNum = i;
                }
            }
        }
        for(int i=0; i<m; i++){
            System.out.print(str[minNum][i]);
        }
        System.out.println();
        System.out.println(min);
    }
}
