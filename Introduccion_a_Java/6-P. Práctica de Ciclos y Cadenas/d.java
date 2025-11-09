import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
    int aux = 0, par = 0, impar = 0;
    for (int  i = 0; i < n; i++){
        aux = entrada.nextInt();
        if (aux % 2 == 0){
            par++; 
        } else {
            impar++; 
        }
        } 
    System.out.println(par + " " + impar);
    }
}