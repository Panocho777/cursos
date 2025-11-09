import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    long n = entrada.nextInt();
        long logg = 0;
        for (long i = 2; i <= n; i *= 2){
            logg++;
        }
        System.out.println(logg);
    }
}
