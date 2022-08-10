import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        prime = new boolean[N + 1];
        isPrime();

        int sum = 0;
        int min = N + 1;
        for(int i = M; i <= N; i++) {
            if(!prime[i]) {
                if(min > i) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n");
            sb.append(min);
        }
        System.out.print(sb);
    }

    public static void isPrime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] =true;
            }
        }
    }
}