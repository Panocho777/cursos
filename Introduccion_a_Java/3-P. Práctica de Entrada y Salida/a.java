import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int altura = 0, base = 0;
    base = entrada.nextInt();
    altura = entrada.nextInt();
        int ans = (base * altura) / 2;
        System.out.println(ans); 

    }
}