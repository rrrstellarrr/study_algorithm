package baekjoon.basicmath_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 네 번째 점
 * 문제 : 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 * 입력 : 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 * 출력 : 직사각형의 네 번째 점의 좌표를 출력한다.
 *
 *      예제 입력 1 : 5 5               예제 출력 1 : 7 7
 *                  5 7
 *                  7 5
 */
public class no3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] node_1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

        st = new StringTokenizer(br.readLine(), " ");
        int[] node_2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

        st = new StringTokenizer(br.readLine(), " ");
        int[] node_3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

        int x, y;
        if(node_1[0] == node_2[0]) x = node_3[0];
        else if(node_1[0] == node_3[0]) x = node_2[0];
        else x = node_1[0];

        if(node_1[1] == node_2[1]) y = node_3[1];
        else if(node_1[1] == node_3[1]) y = node_2[1];
        else y = node_1[1];

        System.out.println(x + " " + y);
    }
}
