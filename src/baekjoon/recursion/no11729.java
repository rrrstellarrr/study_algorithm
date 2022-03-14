package baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 하노이 탑 이동 순서
 * 문제 : 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
 *      1. 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
 *      2. 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
 *      이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
 * 입력 : 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
 * 출력 : 첫째 줄에 옮긴 횟수 K를 출력한다.
 *      두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 */
public class no11729 {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        //
        // 1. 가장 큰 n 번째 원판을 옮기기 위해 n-1 개의 원판을 옮겨야 한다. 이 때 𝑛 개의 원판이 A 에서 B 로 이동하는 경우는 an-1 이다.
        // 2. n번째 원판을 A 에서 C 로 옮기는 경우는 1 이다.
        // 3. B에 있는 n개의 원판이 C로 옮기는 경우는 an-1 이다.
        // => an = an-1 + 1 + an-1 = 2 * an-1 + 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // sb.append((int) (Math.pow(2, N) - 1)).append('\n'); // 제곱을 계산하는 함수
        hanoi(N, 1, 2, 3);

        System.out.println(count);
        System.out.print(sb);
    }

    /***
     *
     * @param N : 원판의 개수
     * @param a : 출발지
     * @param b : 경유지 (원판을 옮기기 위해 이동해야 장소)
     * @param c : 도착지
     */
    public static int hanoi(int N, int a, int b, int c) {
        count++;
        // 이동할 원반의 수가 1개
        if(N == 1) {
            sb.append(a + " " + c).append("\n");
            return count;
        }
        // A -> C로 옮긴다고 가정할 떄,
        // STEP1 : N-1개를 A에서 B로 이동 (= a 지점의 N-1개의 원판을 b 지점으로 옮긴다.)
        hanoi(N - 1, a, c, b);

        // STEP2 : 1개를 A에서 C로 이동 (= a 지점의 N번째 원판을 c지점으로 옮긴다.)
        sb.append(a + " " + c).append("\n");

        // STEP 3 : N-1개를 B에서 C로 이동 (= b 지점의 N-1개의 원판을 c 지점으로 옮긴다.)
        hanoi(N - 1, b, a, c);

        return count;
    }
}
