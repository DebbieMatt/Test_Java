import java.util.Scanner;
import java.util.Stack;
import java.io.IOException; // BEECROWD

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                int[] permutation = new int[N];
                for (int j = 0; j < N; j++) {
                    permutation[j] = scanner.nextInt();
                }

                boolean result = isPossiblePermutation(N, permutation);
                System.out.println(result ? "Yes" : "No");
            }
            System.out.println(); // Linha em branco após cada bloco de entrada
        }
    }

    private static boolean isPossiblePermutation(int N, int[] permutation) {
        Stack<Integer> stack = new Stack<>();
        int expectedVagon = 1;

        for (int vagon : permutation) {
            while (!stack.isEmpty() && stack.peek() == expectedVagon) {
                stack.pop();
                expectedVagon++;
            }

            if (vagon == expectedVagon) {
                expectedVagon++;
            } else {
                stack.push(vagon);
            }
        }

        return stack.isEmpty();
    }
}
