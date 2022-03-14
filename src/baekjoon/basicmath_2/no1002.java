package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 터렛
 * 문제 : 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 *      조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
 *       한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
 * 출력 : 각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
 *
 *      예제 입력 1 :                   예제 출력 1 :
 *      3                             2
 *      0 0 13 40 0 37                1
 *      0 0 3 0 7 4                   0
 *      1 1 1 1 1 5
 */
public class no1002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(get_point(x1, y1, r1, x2, y2, r2)).append("\n");
        }
        System.out.print(sb);
    }

    private static int get_point(int x1, int y1, int r1, int x2, int y2, int r2) {
        int pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // case 1 : 중점이 같으면서 반지름도 같을 경우
        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;

        // case 2: 접점이 없을 경우
        // 2-1 : 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
        else if(pow > Math.pow(r1 + r2, 2)) return 0;
        
        // 2-2 : 한 원 안에 다른 원이 있으면서 접점이 없을 때
        else if(pow < Math.pow(r2 - r1, 2)) return 0;

        // case 3: 접점이 한 개일 때
        // 3-1 : 두 반지름의 차가 두 좌표간의 차랑 같을 때
        else if(pow == Math.pow(r2 - r1, 2)) return 1;

        // 3-2 : 두 좌표간의 거리가 두 반지름의 합과 같을 때
        else if(pow == Math.pow(r1 + r2, 2)) return 1;

        else return 2;
    }
}
