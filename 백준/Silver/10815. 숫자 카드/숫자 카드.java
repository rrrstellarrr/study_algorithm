import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 이분탐색
    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid;

        while(first <= last) {
            mid = (first + last) / 2;   // 중간 인덱스

            // 중간값과 찾으려는 수가 같은 경우
            if(cards[mid] == search) {
                return 1;
            }
            if(cards[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N
        int N = Integer.parseInt(br.readLine());
        // 둘째 줄에는 숫자 카드에 적혀있는 정수
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        // 셋째 줄에는 M
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            int search = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, N, search) + " ");
        }

        br.close();
        System.out.println(sb);
    }
}