import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input ="";
        while((input = br.readLine()) != null) {
            int[] arr = new int[4];
            sb = new StringBuilder();

            for(int i = 0; i < input.length(); i++) {
                // 소문자
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    arr[0]++;
                }
                // 대문자
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    arr[1]++;
                }
                // 숫자
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                    arr[2]++;
                }
                // 공백
                if (input.charAt(i) == ' ') {
                    arr[3]++;
                }
            }
            for(int result : arr) {
                sb.append(result).append(" ");
            }
            sb.append("\n");
            System.out.print(sb);
        }
    }
}