import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];

        int input = scanner.nextInt();

        while(input > 0){
            if(input % 10 == 6){
                num[9]++;
                input /= 10;
            }else {
                num[input % 10]++;
                input /= 10;
            }
        }
        int max = 0;
        int maxNum = 0;

        for(int i=0;i<9;i++){
            max = Math.max(max, num[i]);
        }
        int nine = num[9]/2;
        if(num[9] %2 ==1){
            nine++;
        }
        max = Math.max(max, nine);

        System.out.println(max);

    }
}
