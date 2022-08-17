import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String N = sc.next();
        int len = N.length();
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for(int i = len - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.print(sb);
    }
}