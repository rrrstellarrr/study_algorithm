import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] arr = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        initialization();

        String S = br.readLine();
        indexCheck(S);
        br.close();

        for(int result : arr) {
            sb.append(result).append(" ");
        }
        System.out.print(sb);
    }

    private static void initialization() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
    }

    private static void indexCheck(String S) {
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
    }
}