import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            get_alphanumeric();
        }
        System.out.print(sb);
    }

    private static void get_alphanumeric() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        String S = st.nextToken();

        for(int i = 0; i < S.length(); i++) {
            for(int j = 0; j < R; j++) {
                sb.append(S.charAt(i));
            }
        }
        sb.append("\n");
    }
}