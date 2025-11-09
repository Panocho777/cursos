import java.util.Scanner;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
        int numeros [] = new int[n];
        for (int i = 0; i < n; i++){
            numeros[i] = entrada.nextInt();
            for (int j = 1; j <= 10; j++){
                int ans = numeros[i] * j;
                System.out.println(numeros[i] + "x" + j + "=" + ans);
            }
            System.out.println();
        }
        
    }
}
