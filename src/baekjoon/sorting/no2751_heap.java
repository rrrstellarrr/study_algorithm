package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 수 정렬하기 2
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 */
public class no2751_heap {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        // 힙정렬 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        make_heap(N, arr);

        for(int result : arr) sb.append(result).append("\n");
        System.out.print(sb);
    }

    // 힙구조로 만든다
    private static void make_heap(int n, int[] arr) {
        int c, root, temp;
        for(int i = 1; i < n; i++) {
             c = i; // 자식 인덱스
             do {
                 root = (c - 1) / 2;    // 각 값의 부모 인덱스
                 if(arr[root] < arr[c]) {   // 부모의 값보다 자식의 값이 클 경우
                     temp = arr[root];
                     arr[root] = arr[c];
                     arr[c] = temp;
                 }
                 c = root;
             } while(c != 0);
        }
        heapSort(n, arr);
    }

    // 크기를 줄여가며 반복적으로 힙을 구성한다
    private static void heapSort(int n, int[] arr) {
        int c, root, temp;
        for(int i = n - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];    // 0번째 인덱스 값을 맨 뒤로 보내준다
            arr[i] = temp;
            c = 0;
            root = 0;
            do {
                c = 2 * root + 1;
                // 자식중에 더 큰 값을 찾는다
                if(c < i - 1 && arr[c] < arr[c + 1]) {
                    c++;
                }
                // 부모 값보다 자식 값이 더 클 경우
                if(c < i && arr[root] < arr[c]) {
                    temp = arr[root];
                    arr[root] = arr[c];
                    arr[c] = temp;
                }
                root = c;
            } while(c < i);
        }
    }
}
