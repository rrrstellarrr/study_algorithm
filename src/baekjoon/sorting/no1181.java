package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 단어 정렬
 * 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 *      1. 길이가 짧은 것부터
 *      2. 길이가 같으면 사전 순으로
 * 입력 : 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
 * 출력 : 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 *
 *      예제 입력 1 : 13                        예제 출력 1 :
 *                  but                                 i
 *                  i                                   im
 *                  wont                                it
 *                  hesitate                            no
 *                  no                                  but
 *                  more                                more
 *                  no                                  wait
 *                  more                                wont
 *                  it                                  yours
 *                  cannot                              cannot
 *                  wait                                hesitate
 *                  im
 *                  yours
 */
public class no1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for(int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같을 경우
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);    // 사전 순으로 정렬
                } else {    // 단어의 길이가 다를 경우
                    return o1.length() - o2.length();
                }
            }
        });

        sb.append(words[0]).append("\n");
        for(int i = 1; i < N; i++) {
            if(!words[i].equals(words[i - 1])) {    // 중복체크
                sb.append(words[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
