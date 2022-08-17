import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 퀵정렬
    private static void quickSort(int[][] xy) {
        // 정렬을 할 배열을 받아서 시작위치와 끝나는 지점을 정해서 재귀함수 호출
        quickSort(xy, 0, xy.length - 1);
    }

    private static void quickSort(int[][] xy, int start, int end) {
        // 해당 배열방의 시작과 끝 영역 안에서 파티션을 나눈다.
        int part2 = partition(xy, start, end);

        if(start < part2 - 1) {
            quickSort(xy, start, part2 - 1);
        }

        if(part2 < end) {
            quickSort(xy, part2, end);
        }
    }

    private static int partition(int[][] xy, int start, int end) {
        int pivotX = xy[(start + end) / 2][0];  // x좌표 중앙값
        int pivotY = xy[(start + end) / 2][1];  // y좌표 중앙값

        while(start <= end) {
            // x와 y의 값이 같을 경우 y좌표를 기준으로 비교
            while(xy[start][0] < pivotX ||
                    (xy[start][0] == pivotX && xy[start][1] < pivotY)) {
                start++;
            }
            while (xy[end][0] > pivotX ||
                    (xy[end][0] == pivotX && xy[end][1] > pivotY)) {
                end--;
            }
            if(start <= end) {
                swap(xy, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[][] xy, int start, int end) {
        int temp = xy[start][0];
        xy[start][0] = xy[end][0];
        xy[end][0] = temp;

        temp = xy[start][1];
        xy[start][1] = xy[end][1];
        xy[end][1] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] xy = new int[N][2];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        quickSort(xy);

        for(int i = 0; i < N; i++) {
            sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}