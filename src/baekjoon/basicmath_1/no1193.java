package baekjoon.basicmath_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분수찾기
 * 문제 : 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *      X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * 출력 : 첫째 줄에 분수를 출력한다.
 */
public class no1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int line = 0;   // 입력 받은 숫자가 어느 행에 위치해 있는지 찾을 때 사용
        int cnt = 0;

        // 어느 행에 들어갈 것인지
        while (cnt < X) {
            line++;
            cnt = line * (line + 1) / 2;
        }

        // 그 행에서 몇 번째 값인가?
        int num = X - (line - 1) * line / 2; // 찾으려는 X의 값에 이전 행의 총 개수를 빼준다.

        // 홀수행 짝수행 나눠서 계산
        if(line % 2 == 0) {
            System.out.println(num + "/" + (line - num + 1));
        } else {
            System.out.println((line - num + 1) + "/" + num);
        }
    }
}
