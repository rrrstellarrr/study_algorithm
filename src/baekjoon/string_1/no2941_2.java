package baekjoon.string_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 크로아티아 알파벳
 * 문제 : 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *       dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 * 입력 : 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 *       단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
 * 출력 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *
 *      예제 입력 1 : ljes=njak
 *      예제 출력 1 : 6
 *      예제 입력 2 : ddz=z=
 *      예제 출력 2 : 3
 */
public class no2941_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String croaAlpha : strArr) {
            str = str.replace(croaAlpha, "a");
        }
        System.out.println(str.length());
    }
}
