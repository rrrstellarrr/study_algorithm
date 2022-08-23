import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열사용
public class Main {

    public static int[] queue;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            switch(str) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }

    private static void push(int num) {
        queue[size] = num;
        size++;
    }

    private static int pop() {
        if(size == 0) return -1;
        else {
            int p = queue[0];

            for(int i = 0; i < size; i++) {
                queue[i] = queue[i + 1];
            }
            size--;
            return p;
        }
    }

    private static int size() {
        return size;
    }

    private static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    private static int front() {
        if(size == 0) return -1;
        else return queue[0];
    }

    private static int back() {
        if(size == 0) return -1;
        else return queue[size - 1];
    }
}