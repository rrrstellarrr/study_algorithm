package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 *      예제 입력 1 : 5                 예제 출력 1 : 1
 *                 5                             2
 *                 2                             3
 *                 3                             4
 *                 4                             5
 *                 1
 */
public class no2750_insertsion {

    public static void main(String[] args) throws IOException {
        // 선택정렬을 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int key;
        for(int i = 1; i < N; i++) {
            key = arr[i];
            int j;
            for(j = i - 1; j >= 0; j--) {
                if(arr[j] > key) {
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = key;   // j = -1 이므로 +1을 하여 0번째 자리에 key 값을 넣어 위치 교환
        }

        for(int result : arr) sb.append(result).append("\n");

        System.out.print(sb);
    }
}
