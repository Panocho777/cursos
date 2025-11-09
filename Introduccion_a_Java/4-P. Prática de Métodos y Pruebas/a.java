import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double x = entrada.nextDouble();
    double y = entrada.nextDouble();
    double ans = Math.sqrt((x * x)  + (y * y));
    System.out.printf("%.3f%n", ans);
    }
}