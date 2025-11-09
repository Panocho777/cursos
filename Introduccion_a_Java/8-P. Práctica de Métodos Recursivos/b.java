import java.util.*;
public class Main {
    public static void mostrarBinario(long valor) {
           if (valor > 0) {
              mostrarBinario(valor / 2);
              System.out.println(valor % 2);
           }
    }
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    long n = entrada.nextInt();
        if (n < 0 || n > 500) {
           System.out.println("Error");             
        } else {
                  mostrarBinario(n); 
        }
    }
}