import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double x = entrada.nextDouble();
    double y = (x + 5) / (2 * (x + 1));
    double z = ((y * y) + (x * (x - (2 * y)))) / (x * y);
      System.out.println(z);
    }
}