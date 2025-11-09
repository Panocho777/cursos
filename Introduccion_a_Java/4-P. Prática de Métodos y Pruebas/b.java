import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double area = entrada.nextDouble();
    double pi = 3.141592;
    double radio = Math.sqrt(area / pi);
    double perimetro = 2 * radio;
    double diametro  = 2 * pi * radio;
    System.out.printf("%.2f%n", perimetro);
    System.out.printf("%.2f%n", radio);
    System.out.printf("%.2f%n", diametro);
    }
}