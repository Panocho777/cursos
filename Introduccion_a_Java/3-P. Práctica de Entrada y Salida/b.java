import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int c = entrada.nextInt(), p = entrada.nextInt(), h = entrada.nextInt(), quedan;
        quedan = (c - p) % (1 + h);
        System.out.println(quedan + p);
    }
}