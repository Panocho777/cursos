import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
        int[] a = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = entrada.nextInt();
            total += a[i];
        }
        int half = total / 2;
        int best = 0;
        for (int mask = 0; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += a[i];
                }
            }
            if (sum <= half && sum > best) {
                best = sum;
            }
        }
        int diff = total - 2 * best;
        System.out.println(diff);
    }
}