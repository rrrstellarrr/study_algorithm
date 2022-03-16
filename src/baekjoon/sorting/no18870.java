package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 좌표 압축
 * 문제 : 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
 *      Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
 *      X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 * 입력 : 첫째 줄에 N이 주어진다. 둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
 * 출력 : 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 * 제한 : 1 ≤ N ≤ 1,000,000
 *      -10^9 ≤ Xi ≤ 10^9
 *
 *      예제 입력 1 : 5                     예제 출력 1 : 2 3 0 3 1
 *                  2 4 -10 4 -9
 *
 */
public class no18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] sortNum = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            num[i] = sortNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortNum);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int result : sortNum) {
            if(!map.containsKey(result)) {  // 중복제거
                map.put(result, index);
                index++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int result : num) {
            sb.append(map.get(result)).append("\n");
        }

        System.out.print(sb);
    }
}
