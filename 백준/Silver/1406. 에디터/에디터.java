import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();                 // 초기에 편집기에 입력되어 있는 문자열
        int M = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }

        for(int i = 0; i < M; i++) {
            String s = br.readLine();

            switch(s.charAt(0)) {
                case 'L':   // 커서를 왼쪽으로 한 칸 옮김 -> 왼쪽 스택에서 pop한 값을 오른쪽 스택에 push함
                    if(!leftStack.empty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case 'D':   // 커서를 오른쪽으로 한 칸 옮김 -> 오른쪽 스택에서 pop한 값을 왼쪽 스택에 push함
                    if(!rightStack.empty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case 'B':   // 커서 왼쪽에 있는 문자를 삭제함 -> 왼쪽 스택 pop
                    if(!leftStack.empty()) {
                        leftStack.pop();
                    }
                    break;
                case 'P':   // P 문자 : 문자를 커서 왼쪽에 추가함 -> 왼쪽 스택 pysh
                    leftStack.push(s.charAt(2));
                    break;
            }
        }
        // 왼쪽 스택에 있는 데이터들을 모두 오른쪽으로 옮긴 뒤에 오른쪽에 있는 모든 내용을 출력
        while(!leftStack.empty()) {
            rightStack.push(leftStack.pop());
        }

        while(!rightStack.empty()) {
            sb.append(rightStack.pop());
        }
        System.out.print(sb);
    }
}