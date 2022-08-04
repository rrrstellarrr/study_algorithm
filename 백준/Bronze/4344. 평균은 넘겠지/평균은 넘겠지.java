import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());

        int[] arr;
        for(int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            double sum = 0.0;

            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
                sum += num;
            }

            double avg = (sum / N);
            double count = 0;

            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > avg) {
                    count++;
                }
            }
            sb.append(String.format("%.3f%%",(count / N) * 100)).append("\n");
        }
        System.out.print(sb);
    }
}