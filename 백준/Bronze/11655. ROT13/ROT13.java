import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('a' <= ch && ch <= 'z' - 13) {
                ch = (char) (ch + 13);
            } else if ('z' - 13 <= ch && ch <= 'z') {
                ch = (char) (ch - 13);

            } else if ('A' <= ch && ch <= 'Z' - 13) {
                ch = (char) (ch + 13);

            } else if ('Z' - 13 <= ch && ch <= 'Z') {
                ch = (char) (ch - 13);
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}