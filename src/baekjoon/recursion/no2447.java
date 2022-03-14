package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 10
 * 문제 : 재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
 *       크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
 *       ***
 *       * *
 *       ***
 *       N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다.
 * 입력 : 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.
 * 출력 : 첫째 줄부터 N번째 줄까지 별을 출력한다.
 */
public class no2447 {

    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        get_star(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    // 2차원 배열과 행을 x, 열을 y
    // 인덱스는 0 부터이므로 N = 3 일 때의 공백은 arr[1][1] 이다.
    // 즉 행부터 채울 때, (0, 0), (0, 1), (0, 2), (1, 0) 까지는 별을 출력하고 별 출력이 4 번 이루어지면 그다음 블럭은 반드시 공백이라는 것이다.
    static void get_star(int x, int y, int N, boolean blank) {

        // blank 가 true 라면 공백칸
        if(blank) {
            for(int i = x; i < x + N; i++) {
                for(int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더이상 쪼갤 수 없는 블록일 때
        if(N == 1) {
            arr[x][y] = '*';
            return;
        }

        // N=27 일 경우 한 블록의 사이즈 : 9
        // N=9 일 경우 한 블록의 사이즈 : 3
        int size = N / 3;   // 해당 블록의 한 칸
        int count = 0;      // 별 출력 누적 합
        for(int i = x; i < x + N; i += size) {
            for(int j = y; j < y + N; j += size) {
                count++;
                if(count == 5) {    // 공백 칸일 경우
                    get_star(i, j, size, true);
                } else {
                    get_star(i, j, size, false);
                }
            }
        }
    }
}
