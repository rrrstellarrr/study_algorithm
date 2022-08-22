import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static String isVps(String str) {
        Stack<Character> stack = new Stack<>();

        for(int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);

            if(c == '(') {
                stack.push(c);
            } else if(stack.empty()) {  // 닫는 괄호가 여는 괄호보다 많은 경우(더이상 pop이 불가능할 때)
                return "NO";
            } else {    // 닫는 괄호
                stack.pop();
            }
        }

        // 잔여 요소가 없는 경우
        if(stack.empty()) {
            return "YES";
        // 잔여 요소가 남아있는 경우(괄호의 짝이 맞지 않음)
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            sb.append(isVps(br.readLine())).append("\n");
        }
        System.out.print(sb);
    }
}