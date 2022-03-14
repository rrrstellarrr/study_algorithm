package baekjoon.basicmath_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 벌집
 * 문제 : 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
 *      숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
 * 출력 : 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 *
 *      예제 입력 1 : 13        예제 출력 1 : 3
 */
public class no2292 {

    public static void main(String[] args) throws IOException {

        // 1, 6, 12, 18, 24
        // 1
        // 2 ~ 7    : +1
        // 8 ~ 19   : +1
        // 20 ~ 37  : +1
        // 39 ~ 61  : +1

        // 58 = 1 + 6 * n

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(roomCnt(num));
    }

    public static int roomCnt(int num) {
        int cnt = 1;
        int sum = 1;

        while(num > sum) {
            sum += cnt * 6;
            cnt++;
        }
        return cnt;
    }
}
