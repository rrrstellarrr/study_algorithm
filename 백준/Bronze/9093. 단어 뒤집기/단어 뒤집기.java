import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");

            StringBuilder sb = new StringBuilder();

            for(String result : str) {
                StringBuilder rev = new StringBuilder(result);
                sb.append(rev.reverse()).append(' ');
            }
            System.out.println(sb);
        }
    }
}