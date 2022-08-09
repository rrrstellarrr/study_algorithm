import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] arr = new int[15][15];

    public static void main(String[] args) throws IOException {
        apt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int k, n;
        for(int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append("\n");
        }
        System.out.print(sb);
    }

    public static void apt() {
        for(int i = 0; i < 15; i++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }
    }
}