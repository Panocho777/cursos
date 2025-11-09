import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int ans = 0, aux = 1;
      while (aux != 0){
          aux = entrada.nextInt();
              ans += aux;  
        }
    System.out.println(ans);

    }
}