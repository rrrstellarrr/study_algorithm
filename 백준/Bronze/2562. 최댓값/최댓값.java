import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num > max) {
                max = num;
                index = i + 1;
            }
        }
        sb.append(max).append("\n").append(index);
        System.out.print(sb);
    }
}