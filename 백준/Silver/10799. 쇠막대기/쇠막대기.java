import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        int cnt = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {    // '('를 만나면 stack에 '('을 push
                stack.push('(');
                continue;
            } else if(input.charAt(i) == ')') { // ')'를 만났을 경우에는 stack에서 pop
                stack.pop();

                if(input.charAt(i - 1) == '(') {    // 만약 ')' 바로 전 문자가 '('이었다면, 그것은 레이저를 의미하므로 ans에 stack의 사이즈만큼 더해준다
                    cnt += stack.size();
                } else {
                    cnt++;  // 만약 ')' 바로 전 문자가 ')'이었다면, 그것은 단순히 닫힌 문자열이므로 단순히 1을 더해준다
                }
            }
        }
        System.out.println(cnt);
    }
}