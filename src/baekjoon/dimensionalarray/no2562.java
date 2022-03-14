package baekjoon.dimensionalarray;

import java.util.Scanner;

/**
 * 최댓값
 * 문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 * 출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
public class no2562 {

    static int[] arr = new int[9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {
                max = arr[i];
                cnt = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
