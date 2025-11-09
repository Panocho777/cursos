import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String a = entrada.nextLine();
    String b = entrada.nextLine();
        char[] a_c = a.toCharArray();
        char[] b_c = b.toCharArray();
        Arrays.sort(a_c);
        Arrays.sort(b_c);
        String a_o = new String(a_c);
        String b_o = new String(b_c);
        if (a_o.equals(b_o)){
           System.out.println("SI son anagramas"); 
        } else {
           System.out.println("NO son anagramas");  
        }
    }
}
