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
public class no2751_merge {

    static int[] arr;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];
        result = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, N - 1, arr);

        for(int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }

    public static void mergeSort(int left, int right, int[] arr) {   // 숫자 뱌열을 가져와서 배열의 길이가 1이 될 때 까지 쪼개주는 메소드
        int middle;    // 배열을 반으로 나누는 변수
        if(left < right) {
            middle = (left + right) / 2;    // 배열을 반으로 나눔
            mergeSort(left, middle, arr);   // 배열의 가운데를 기준으로 왼쪽 부분의 배열을 길이가 1이 될 때 까지 쪼갠다
            mergeSort(middle + 1, right, arr);
            operation(left, middle, right, arr);    // 나눈 배열을 합친다
        }
    }

    public static void operation(int left,int middle , int right, int[] arr) {
        int left_idx = left;
        int middle_idx = middle + 1;
        int index = left;   // 정렬 후 배열의 맨 앞 인덱스

        // 작은 수서대로 배열에 삽입
        while(left_idx <= middle && middle_idx <= right) {
            if(arr[left_idx] <= arr[middle_idx]) {  // 더 작은 수를 왼쪽으로 보낸다
                result[index] = arr[left_idx];
                left_idx++;
            } else {
                result[index] = arr[middle_idx];
                middle_idx++;
            }
            index++;
        }
        // 왼쪽 배열의 정렬이 먼저 끝났을 경우
        if(left_idx > middle) {
            for(int i = middle_idx; i <= right; i++) { // 남은 오른쪽 배열의 정렬을 해 준다.
                result[index] = arr[i];
                index++;
            }
        } else {
            for(int i = left_idx; i <= middle; i++) { // 남은 왼쪽 배열의 정렬을 해 준다.
                result[index] = arr[i];
                index++;
            }
        }
        // 정렬된 배열을 합친다.
        for(int i = left; i <= right; i++) {
            arr[i] = result[i];
        }
    }
}
