import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        StringBuilder output = new StringBuilder();  

        while (entrada.hasNextLine()) {
            String line = entrada.nextLine();
            StringBuilder word = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch != ' ') {
                    word.append(ch);  
                } else {
                   
            output.append(word.reverse());
            output.append(' ');
            word.setLength(0); 
                }
        }
        output.append(word.reverse());
        output.append('\n');
        word.setLength(0);
        }

        System.out.print(output);  
    }
}