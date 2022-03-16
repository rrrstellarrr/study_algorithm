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
public class no2750_selection {

    public static void main(String[] args) throws IOException {
        // 선택정렬을 이용
        // 1. 배열의 제일 앞의 인덱스 값과 0번째의 값을 비교해서 작은 값을 비교하여 배열의 가장 작은 값을 찾는다.
        // 2. 0번째 이후로 가장 작은값 찾아서 하나하나 채워넣는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int temp;
        for(int i = 0; i < N - 1; i++) {
            int min_index = i;  // 무작위
            for(int j = i + 1; j < N; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if(arr[i] > arr[min_index]) {
                temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }

        for(int result : arr) sb.append(result).append("\n");

        System.out.print(sb);
    }
}
