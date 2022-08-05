import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            get_alphanumeric();
        }
        System.out.print(sb);
    }

    private static void get_alphanumeric() {
        int R = sc.nextInt();
        String S = sc.next();

        for(int i = 0; i < S.length(); i++) {
            char alpha = S.charAt(i);
            for(int j = 1; j <= R; j++) {
                sb.append(alpha);
            }
        }
        sb.append("\n");
    }
}