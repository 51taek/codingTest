package Back;

import java.util.Scanner;

public class Joon2839 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salt = scanner.nextInt();
        int bag = 0;


        while(salt>0){
            if(salt % 5 == 0){
               bag += salt/5;
                System.out.println(bag);
                return ;
            }
            salt -= 3;
            bag++;
            if(salt==0){
                System.out.println(bag);
                return ;
            }
        }
        System.out.println(-1);
    }





}
