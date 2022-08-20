import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[][] person = new String[N][2];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            person[i][0] = st.nextToken();
            person[i][1] = st.nextToken();
        }
        br.close();

        Arrays.sort(person, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0; i < N; i++) {
            sb.append(person[i][0]).append(' ').append(person[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}