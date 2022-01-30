
import java.util.Scanner;
/**
 * criando um anagrama de palavras
 */
public class anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        String novaPalavra = " ";

        for( int i = palavra.length() -1; i >= 0; i--){
           novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
        }

        System.out.println(novaPalavra);
    }
}