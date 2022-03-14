package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직각삼각형
 * 문제 : 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 * 입력 : 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
 * 출력 : 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
 *
 *      예제 입력 1 :               예제 출력 1 :
 *       6 8 10                     right
 *       25 52 60                   wrong
 *       5 12 13                    right
 *       0 0 0
 */
public class no4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int auset = Integer.parseInt(st.nextToken());
            int ausar = Integer.parseInt(st.nextToken());
            int heru = Integer.parseInt(st.nextToken());

            if(auset == 0 && ausar == 0 && heru == 0) break;

            if((auset * auset) + (ausar * ausar) == (heru * heru)) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");
        }
        System.out.print(sb);
    }
}
