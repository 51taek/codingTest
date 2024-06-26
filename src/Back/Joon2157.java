package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joon2157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] num = new int[26];
        int max=0;
        char ch = '?';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                num[s.charAt(i) - 'A']++;
            }
            else {
                num[s.charAt(i) - 'a']++;
            }
        }

        for(int i=0; i<26; i++){
            if(max < num[i]){
                max = num[i];
                ch = (char)(i+65);
            }
            else if(max == num[i]){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
