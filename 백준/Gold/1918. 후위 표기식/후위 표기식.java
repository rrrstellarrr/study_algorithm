import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        String[] arr = new String[str.length()];

        for(int i = 0; i < str.length(); i++) {
            // 'A'~'Z'라면 출력
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                sb.append(str.charAt(i));

            // '(' 라면 그냥 스택에 넣는다.
            } else if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));

            // ')' 일 경우 '(' 를 만날때까지 스텍에 쌓인 연산자를 출력한다,
            } else if(str.charAt(i) == ')') {
                while(!stack.empty()) {
                    if(stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            } else {
                // 연산자 우선순위가 더 큰경우에만 스텍에 집어넣기
                // 우선순위가 같거나 낮은경우 우선 스텍에 있는 연산자 전부 출력 후 집어넣기
                while(!stack.empty() && precedence(stack.peek()) >= precedence(str.charAt(i))) {
                    sb.append(stack.pop());
                }
                stack.push(str.charAt(i));
            }
        }
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    // 연산자 우선순위 정하기
    private static int precedence(Character input) {
        if(input == '(') {
            return 0;
        } else if(input == '+' || input == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}