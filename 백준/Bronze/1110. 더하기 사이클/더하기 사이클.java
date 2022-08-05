import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0, tmp = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (tmp != N);

        System.out.println(cnt);
    }
}