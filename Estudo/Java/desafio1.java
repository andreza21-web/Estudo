/**
 * O programa pedirá quantos valores irá ser calculado de 0 a 50
 * vai ser feito o pedido para inserir o valor 
 * por fim irá somar tudo
 */

import java.util.Scanner;

public class desafio1 {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String valor;
        int n;
        double soma= 0;

        do{
            System.out.print("Digite  quantos valores serão digitados, sabendo que deverá ser menor que 50 :");
            valor = scanner.next();
            n = Integer.parseInt(valor);
        } while( n > 50 || n < 0 );

        double[] qtNumero = new double[n];

        System.out.print("Digite o valor: ");

        for( int i = 0; i < qtNumero.length; i++)
        {
            System.out.print("\r\n Valor: " + (i+1) + " :");
            valor = scanner.next();
            qtNumero[i] = Double.parseDouble(valor);
            soma += qtNumero[i];
        }
        System.out.print("\r\n A soma dos valoes é " + soma);
             
        scanner.close();

    }
    
}
