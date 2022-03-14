package baekjoon.basicmath_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ACM 호텔
 * 문제 : 각 층에 W 개의 방이 있는 H 층 건물이라고 가정하자 (1 ≤ H, W ≤ 99). 그리고 엘리베이터는 가장 왼쪽에 있다고 가정하자.
 *      호텔 정문은 일층 엘리베이터 바로 앞에 있는데, 정문에서 엘리베이터까지의 거리는 무시한다. 또 모든 인접한 두 방 사이의 거리는 같은 거리라고 가정하고 호텔의 정면 쪽에만 방이 있다고 가정한다.
 *      방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고 XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다. 즉, 그림 에서 빗금으로 표시한 방은 305 호가 된다.
 *      초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다.
 *      첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.
 * 입력 : 프로그램은 표준 입력에서 입력 데이터를 받는다. 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다. 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W).
 * 출력 : 프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
 *
 *      예제 입력 1 : 2                     예제 출력 1 : 402
 *                  6 12 10                          1203
 *                  30 50 72
 */
public class no10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트 데이터

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());   // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken());   // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken());   // 몇 번째 손님

            int x, y;
            if(N % H == 0) {
                y = H * 100;  // 층 구하기 (최소 100의 자릿수부터 시작)
                x = (N / H);    // 거리 구하기 (엘레베이터로부터 떨어진 거리. 1부터 시작)
                sb.append(y + x).append("\n");
            } else {
                y = (N % H) * 100;
                x = (N / H) + 1;
                sb.append(y + x).append("\n");
            }
        }
        System.out.print(sb);
    }
}
