import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    long numero = entrada.nextInt();
    long posiciones = entrada.nextInt();
        long numero_der = 0, numero_izq = 0;
    if (posiciones % 3 == 0){
            numero_izq = numero;
            numero_der = numero;
            
    } else if ((posiciones - 1) % 3 == 0){
                if (numero == 1){
                    numero_izq = 3;
                    numero_der = 2;
                } else if (numero == 2){
                    numero_izq = 1;
                    numero_der = 3;    
                } else if (numero == 3){
                    numero_izq = 2;
                    numero_der = 1;
                }
    } else if ((posiciones + 1) % 3 == 0){
                if (numero == 1){
                    numero_izq = 2;
                    numero_der = 3;
                } else if (numero == 2){
                    numero_izq = 3;
                    numero_der = 1;    
                } else if (numero == 3){
                    numero_izq = 1;
                    numero_der = 2;
                }
        }
    System.out.println(numero_izq + " " + numero_der);
    }
}
