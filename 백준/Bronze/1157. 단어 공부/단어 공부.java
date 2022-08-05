import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String str = sc.next().toUpperCase();

        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int max = -1;
        char alphabet = ' ';
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                alphabet = (char) (i + 65);
            } else if(arr[i] == max) {
                alphabet = '?';
            }
        }
        System.out.println(alphabet);
    }
}