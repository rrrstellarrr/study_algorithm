package baekjoon.basicmath_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부녀회장이 될테야
 * 문제 : 이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
 *      아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
 *      단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 * 입력 : 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
 * 출력 : 각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.
 * 제한 : 1 ≤ k, n ≤ 14
 *      예제 입력 1: 2              예제 출력 1: 6
 *                1                        10
 *                3
 *                2
 *                3
 */
public class no2775 {

    static int[][] people = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        countPeople(people);

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());    // 층
            int n = Integer.parseInt(br.readLine());    // 호

            sb.append(people[k][n]).append("\n");
        }
        System.out.print(sb);
    }

    private static void countPeople(int[][] people) {
        // 0층의 i호 => i명
        // k층 n호 => (k-1)층 1호~n호 까지의 사람 수
        // 0층 : 1   2   3   4   5   6   7   8   ...
        // 1층 : 1   3   6   10  15  21  28  36  ...
        // k층 : 1   1호+(k-1)층 2호
        for (int i = 1; i < 15; i++) {
            people[0][i] = i;
        }
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 14; j++) {
                if(j == 1) {
                    people[i][j] = 1;
                } else {
                    people[i][j] = people[i - 1][j] + people[i][j - 1];
                }
            }
        }
    }
}
