package baekjoon.string_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 * 입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 *
 *      예제 입력 1 : Mississipi
 *      예제 출력 1 : ?
 *      예제 입력 2 : zZa
 *      예제 출력 2 : Z
 */
public class no1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(getAlphabet(str.toUpperCase()));
    }

    public static char getAlphabet(String str) {
        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int point = 0, maxCount = 0, cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 && arr[i] > maxCount) {
                cnt = 0;
                maxCount = arr[i];
                point = i;
            } else if(maxCount > 0 && maxCount == arr[i]) {
                cnt++;
            }
        }
        if(cnt > 0) {
            return '?';
        } else {
            return (char) (point + 65);
        }
    }
}
