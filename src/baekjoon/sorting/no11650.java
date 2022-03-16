package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 좌표 정렬하기
 * 문제 : 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 * 출력 : 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 *
 *      예제 입력 1 : 5                 예제 출력 1 : 1 -1
 *                  3 4                          1 1
 *                  1 1                          2 2
 *                  1 -1                         3 3
 *                  2 2                          3 4
 *                  3 3
 */
public class no11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /**
         * Comparator<T> 인터페이스 재정의
         *  int[] : 2차원 배열에서 하나의 행을 기준으로 비교
         */
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                // x좌표의 값이 같다면 y좌표를 기준으로 정렬
//                if(o1[0]==o2[0]) return Integer.compare(o1[1],o2[1]);
//                // 나머지를 x좌표를 기준으로 정렬
//                else return Integer.compare(o1[0], o2[0]);
//            }
//        });

        // 람다식
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ");
            sb.append(arr[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}
