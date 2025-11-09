import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
        int numeros [] = new int[n];
        for (int i = 0; i < n; i++){
            numeros[i] = entrada.nextInt();
        }

        for (int i = n - 1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}