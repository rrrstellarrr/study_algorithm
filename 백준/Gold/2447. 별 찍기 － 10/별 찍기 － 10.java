import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        arr = new char[N][N];

        for(int i = 0; i < N; i++) {
            Arrays.fill(arr[i], ' ');
        }

        star(0, 0, N);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static void star(int x, int y, int N) {
        if(N == 1) {
            arr[x][y] = '*';
            return;
        }

        int len = N / 3;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(!(i == 1 && j == 1)) {
                    star(x + (i * len), y + (j * len), len);
                }
            }
        }
    }
}