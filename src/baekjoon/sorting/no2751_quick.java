package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 2
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 */
public class no2751_quick {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        // 퀵정렬 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arr, 0, N - 1);

        for(int result : arr) sb.append(result).append("\n");

        System.out.print(sb);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {  // 값이 1개인 경우
            return;
        }

        int pivot = start;
        int i = start + 1;  // 왼쪽부터 하나씩 큰 값을 찾을 때의 인덱스. pivot의 오른쪽으로 한 칸씩 이동하면서 pivot보다 큰 값을 찾는다.
        int j = end;        // 오른쪽부터 하나씩 작은 값을 찾을 때의 인덱스. 배열의 끝에서부터 왼쪽으로 한 칸씩 이동하면서 pivot보다 작은 값을 찾는다.
        int temp;

        while(i <= j) { // 왼쪽과 오른쪽이 서로 엇갈리지 않을때까지 반복 탐색.
            while(i < end && arr[i] <= arr[pivot]) {   // pivot 값 보다 큰 값을 만날때까지 오른쪽으로 이동
                i++;
            }
            while(j > start && arr[j] >= arr[pivot]) {   // pivot 값 보다 작은 값을 만날때까지 왼쪽으로 이동
                j--;
            }
            if(i > j) { // 엇갈리는 경우 왼쪽 인덱스의 값과 pivot 값을 서로 바꿔준다.
                temp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = temp;
            } else {    // 엇갈리지 않았을 경우 왼쪽 인덱스의 값과 오른쪽 인덱스의 값을 서로 바꿔준다.
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // pivot을 기준으로 왼쪽 배열과 오른쪽 배열을 나누어서 각각 다시 퀵정렬을 수행(재귀)
        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
    }
}
