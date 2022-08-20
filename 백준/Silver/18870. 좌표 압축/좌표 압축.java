import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            x[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int index = 0;
        for(int i = 0; i < N; i++) {
            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], index);
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int result : x) {
            sb.append(map.get(result)).append(' ');
        }
        System.out.println(sb);
    }
}