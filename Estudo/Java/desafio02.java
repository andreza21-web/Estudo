import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valor;
        int n;
        double soma = 0;
        double positivo =0;
        double negativo = 0;
        double maiorValor = 0;
        double menorValor = 0;
        double media;
        double porcentagemNegativo;
        double porcentagemPositivo;
        
        do{

            System.out.print("Digite quantos valores serão digitados, sabendo que deverá ser positivo e menor que 20: ");
            valor = scanner.next();
            n = Integer.parseInt(valor);
        } while( n > 20 || n < 0);

        double[] qtNumero = new double[n];

        System.out.print("Digite o valor: ");

        for( int i = 0; i <  qtNumero.length; i++)
        {
            System.out.print("\r\n Valor: ");
            valor = scanner.next();
            qtNumero[i] = Double.parseDouble(valor);
            soma +=qtNumero[i];

        }
        for( int i = 0; i <  qtNumero.length; i++)
        {
            if (qtNumero[i] >= 0)
            {
                positivo++;
            }
            else {
                negativo++;
            }
        }

        for( int i = 0; i <  qtNumero.length; i++)
        {
            if( qtNumero[i] > maiorValor);
            {
                maiorValor = qtNumero[i];
            }
            if( qtNumero[i] < menorValor);
            {
                menorValor = qtNumero[i];
            }
        }

        media = ( soma /qtNumero.length);
        porcentagemNegativo = ( negativo / qtNumero.length) * 100;
        porcentagemPositivo = ( positivo / qtNumero.length ) * 100;

        System.out.print("\r\n O maior valor é " + maiorValor);
        System.out.print("\r\n O menor valor é " + menorValor);
        System.out.print("\r\n A soma dos valores é " + soma);
        System.out.print("\r\n A media aritmetica dos valores é " + media);
        System.out.print("\r\n A porcentagem de valores positivos e " + porcentagemPositivo);
        System.out.print(" \r\n A porcentagem dos valores negativos é " + porcentagemNegativo);
        System.out.print("\r\n");


        scanner.close();

    }
    
}
