package baekjoon.string_1;

import java.io.IOException;

/**
 * 다이얼
 * 문제 : 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
 *      숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 * 입력 : 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 * 출력 : 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 *
 *      예제 입력 1 : WA
 *      예제 출력 1 : 13
 *      예제 입력 2 : UNUCIC
 *      예제 출력 2 : 36
 */
public class no5622 {

    public static void main(String[] args) throws IOException {

        int time = 0;
        while (true) {
            int alphabet = System.in.read();

            if(alphabet == '\n') {
                break;
            }

            if (alphabet < 'D') {
                time += 3;
            } else if (alphabet < 'G') {
                time += 4;
            } else if (alphabet < 'J') {
                time += 5;
            } else if (alphabet < 'M') {
                time += 6;
            } else if (alphabet < 'P') {
                time += 7;
            } else if (alphabet < 'T') {
                time += 8;
            } else if (alphabet < 'W') {
                time += 9;
            } else if (alphabet <= 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
