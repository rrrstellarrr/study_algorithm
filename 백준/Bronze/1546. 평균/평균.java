import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1;
        double sum = 0.0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(num > max) max = num;

            sum += num;
        }
        System.out.println(((sum / max) * 100.0) / N);
    }
}