import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 'D') count += 3;
            else if(str.charAt(i) < 'G') count += 4;
            else if(str.charAt(i) < 'J') count += 5;
            else if(str.charAt(i) < 'M') count += 6;
            else if(str.charAt(i) < 'P') count += 7;
            else if(str.charAt(i) < 'T') count += 8;
            else if(str.charAt(i) < 'W') count += 9;
            else count += 10;
        }
        System.out.println(count);
    }
}