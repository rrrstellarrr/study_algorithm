import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Stack 연산
 *  pop(): 스택에서 가장 위에 있는 항목을 제거한다.
 *  push(item): item 하나를 스택의 가장 윗 부분에 추가한다.
 *  peek(): 스택의 가장 위에 있는 항목을 반환한다.
 *  isEmpty(): 스택이 비어 있을 때에 true를 반환한다.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        /**
         *              stack[] = {}               result[] = {}           연산
         * push 1:   stack = {1}               result = {}                  +
         * push 2:   stack = {1,2}             result = {}                  +
         * push 3:   stack = {1,2,3}           result = {}                  +
         * push 4:   stack = {1,2,3,4}         result = {}                  +
         *  pop 4:   stack = {1,2,3}           result = {4}                 -
         *  pop 3:   stack = {1,2}             result = {4,3}               -
         * push 5:   stack = {1,2,5}           result = {4,3}               +
         * push 6:   stack = {1,2,5,6}         result = {4,3}               +
         *  pop 6:   stack = {1,2,5}           result = {4,3,6}             -
         * push 7:   stack = {1,2,5,7}         result = {4,3,6}             +
         * push 8:   stack = {1,2,5,7,8}       result = {4,3,6}             +
         *  pop 8:   stack = {1,2,5,7}         result = {4,3,6,8}           -
         *  pop 7:   stack = {1,2,5}           result = {4,3,6,8,7}         -
         *  pop 5:   stack = {1,2}             result = {4,3,6,8,7,5}       -
         *  pop 2:   stack = {1}               result = {4,3,6,8,7,5,2}     -
         *  pop 1:   stack = {}                result = {4,3,6,8,7,5,2,1}   -
         */
        int start = 0;  // 이전에 어디까지 입력 받았는지를 알기 위한 변수
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num > start) {
                // start+1부터 입력받은 num까지 push
                for(int j = start + 1; j <= num; j++) {
                    stack.push(j);  
                    sb.append("+").append("\n");
                }
                start = num; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            // 제일 위에 있는 원소(가장 늦게 push된 원소)가 입력 받은 값과 다를 경우
            else if(stack.peek() != num) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.print(sb);
    }
}