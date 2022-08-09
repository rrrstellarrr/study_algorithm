import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            
            if(N % H == 0) {
                sb.append((H * 100) + (N / H)).append("\n");
            } else {
                sb.append(((N % H) * 100) + ((N / H) + 1)).append("\n");
            }
        }
        System.out.print(sb);
    }
}