package Back;

import java.util.Scanner;

public class Joon10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[26];

        String input = sc.next();

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            freq[c - 'a']++;
        }

        for (int i=0; i<26; i++) {
            System.out.print(freq[i] + " ");
        }

    }
}
