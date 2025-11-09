import java.util.*;
public class Main {

    static String generar(int n) {
        if (n == 1) return "A";
        char letra = (char)('A' + (n - 1));
        return generar(n - 1) + letra + generar(n - 1);
    }
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
        String s = generar(n);
        System.out.print(s);
    }
}