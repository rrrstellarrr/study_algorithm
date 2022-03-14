package baekjoon.string_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그룹 단어 체커
 * 문제 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 *       단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
 *
 *      예제 입력 1 : 3                 예제 출력 1 : 3
 *                  happy
 *                  new
 *                  year
 *      예제 입력 2 : 4                 예제 출력 2 : 1
 *                  aba
 *                  abab
 *                  abcabc
 *                  a
 */
public class no1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if(alphaCheck()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean alphaCheck() throws IOException {
        boolean[] check = new boolean[26];
        int num = 0;    // 문자열의 문자들을 하나씩 꺼내와 비교하기 위한 변수
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int nowNum = str.charAt(i); // i 번째 문자 저장 (현재 문자)

            // num 과 현재 문자가 다를 경우(비연속 문자일 경우) -> 해당 문자가 중복된 문자인지 여부를 검사
            if(num != nowNum) {

                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if(!check[nowNum - 'a']) {
                    check[nowNum - 'a'] = true;
                    num = nowNum;
                } else {    // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                    return false;
                }
            } else {    // num 과 현재 문자가 같을 경우 -> 해당 문자가 중복된 문자인지 여부를 검사하지 않는다
                continue;
            }
        }
        return true;
    }
}
