import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            if(check_alphabet()) count++;
        }

        System.out.println(count);
    }

    private static boolean check_alphabet() throws IOException {
        boolean[] arr = new boolean[26];
        char check = ' ';
        String word = br.readLine();

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(check != c) {
                if(!arr[c - 'a']) {
                    arr[c - 'a'] = true;
                    check = c;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}