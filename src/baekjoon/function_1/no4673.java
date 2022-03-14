package baekjoon.function_1;

/**
 * 셀프 넘버
 * 문제 : 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
 *       10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 출력 : 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
 */
public class no4673 {

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for(int i = 0; i < check.length; i++) {
            int n = d(i);

            if(n < 10001) {
                check[n] = true;    // false : 셀프 넘버
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < check.length; i++) {
            if(!check[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum; // return = 생성자가 있는 수
    }
}
