import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String bin1 = entrada.next(); 
    String bin2 = entrada.next(); 
    BigInteger a = new BigInteger(bin1, 2);
    BigInteger b = new BigInteger(bin2, 2);
   BigInteger result = a.multiply(b);

        System.out.println(result.toString(2));
    }
}