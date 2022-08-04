import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int multiply = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        int[] count = new int[10];
        while(multiply > 0) {
            count[multiply % 10]++;
            multiply /= 10;
        }

        for(int result : count) sb.append(result).append("\n");
        
        System.out.print(sb);
    }
}