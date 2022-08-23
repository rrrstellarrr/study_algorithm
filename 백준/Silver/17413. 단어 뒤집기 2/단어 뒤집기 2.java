import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean check = false;

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '<') {
                check = true;
                while(!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(S.charAt(i));
            } else if(S.charAt(i) == '>') {
                check = false;
                sb.append(S.charAt(i));
            } else if(check) {
                sb.append(S.charAt(i));
            } else {
                if(S.charAt(i) == ' ') {
                    while(!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(S.charAt(i));
                } else {
                    stack.push(S.charAt(i));
                }
            }
        }
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.print(sb);
    }
}