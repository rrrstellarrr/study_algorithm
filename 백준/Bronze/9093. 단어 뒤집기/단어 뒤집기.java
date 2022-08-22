import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            while(st.hasMoreTokens()) {
                sb.append(new StringBuilder(st.nextToken()).reverse().toString()).append(' ');
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}