import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        isPrime();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i ++) {
            int n = Integer.parseInt(br.readLine());
            int left = n / 2, right = n / 2;

            while(true) {
                if (!prime[left] && !prime[right]) {
                    sb.append(left).append(" ").append(right).append("\n");
                    break;
                }
                left--;
                right++;
            }
        }
        System.out.print(sb);
    }

    public static void isPrime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}