import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static int cont = 0;
    public static int fibonacci(int x){
        cont++;
        if (x == 1){
            return 1;
        } 
        if (x == 0) {
            return 0;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans + " " + cont);
    }
}