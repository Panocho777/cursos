import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int x = entrada.nextInt(), y = entrada.nextInt(), z = entrada.nextInt();
        if (x == y && x == z) {
            System.out.println("equilatero");
        } else if (x == y || x == z || z == y) {
            System.out.println("isosceles");
        } else { 
            System.out.println("escaleno");
        }

    }
}