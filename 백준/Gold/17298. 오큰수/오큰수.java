import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());                                // 4
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");    // 3 5 2 7

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            while(!stack.empty() && A[stack.peek()] < A[i]) {
                A[stack.pop()] = A[i];                          // A[0] = 5; A[2] = 7; A[1] = 7; => A: [5, 7, 7, 7]
            }
            stack.push(i);
        }
        while(!stack.empty()) {     // stack: size = 1
            A[stack.pop()] = -1;    // A[3] = -1;   => A: [5, 7, 7, -1]
        }

        for(int result : A) {
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }
}