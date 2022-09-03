import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Double[] arr = new Double[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        double result = 0;
        for(int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                stack.push(arr[str.charAt(i) - 'A']);
            } else {
                double d1 = stack.pop();
                double d2 = stack.pop();

                switch(str.charAt(i)) {
                    case '+':
                        result = d2 + d1;
                        stack.push(result);
                        continue;
                    case '-':
                        result = d2 - d1;
                        stack.push(result);
                        continue;
                    case '*':
                        result = d2 * d1;
                        stack.push(result);
                        continue;
                    case '/':
                        result = d2 / d1;
                        stack.push(result);
                        continue;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}