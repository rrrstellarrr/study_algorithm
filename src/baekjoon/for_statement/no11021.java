package baekjoon.for_statement;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A+B - 7
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 *
 *      예제 입력 1 : 5                 예제 출력 1 : Case #1: 2
 *                  1 1                           Case #2: 5
 *                  2 3                           Case #3: 7
 *                  3 4                           Case #4: 17
 *                  9 8                           Case #5: 7
 *                  5 2
 */
public class no11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write("Case #1: " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
