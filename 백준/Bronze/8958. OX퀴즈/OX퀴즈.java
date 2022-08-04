import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            int score = 0, sum = 0;
            for(byte value : br.readLine().getBytes()) {
                if(value == 'O') {
                    ++score;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}