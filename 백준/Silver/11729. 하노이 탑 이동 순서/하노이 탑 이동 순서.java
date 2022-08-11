import java.util.Scanner;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        hanoi(N, 1, 2, 3);
        System.out.println(count);
        System.out.print(sb);
    }

    private static void hanoi(int n, int start, int mid, int to) {
        count++;

        if(n == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n - 1, start, to, mid);
        sb.append(start).append(" ").append(to).append("\n");
        hanoi(n - 1, mid, start, to);
    }
}