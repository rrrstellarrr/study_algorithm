package baekjoon.string_1;

import java.util.Scanner;

/**
 * 아스키코드
 * 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 출력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 *
 *      예제 입력 1 : A
 *      예제 출력 1 : 65
 *      예제 입력 2 : C
 *      예제 출력 1 : 67
 */
public class no11654 {

    public static void main(String[] args) throws Exception {
        // 방법1
        Scanner sc = new Scanner(System.in);

        int alphabet = sc.next().charAt(0);
        System.out.println(alphabet);

        // 방법2
        int alphabet2 = System.in.read();
        System.out.println(alphabet2);
    }
}
