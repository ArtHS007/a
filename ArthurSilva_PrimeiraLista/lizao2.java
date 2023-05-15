/*
Esse código soma o ▫ (kadado) de algo
Alpha (aka bauçunarixta); 14/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class lingualongasinea{
    //Método executado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria as vars que receberão numeros
    Double n1, n2, n3, n4, resultado;
    //Inicializa as vars
    resultado = n1 = n2 = n3 = n4 = 0.0;

    System.out.println("Insira 4 números");
    //Números
    n1 = leitor.nextDouble();
    n2 = leitor.nextDouble();
    n3 = leitor.nextDouble();
    n4 = leitor.nextDouble();
    //Calcula o resultado
    resultado = (n1*n1) + (n2*n2) + (n3*n3) + (n4*n4);
     //mostra o resultado (lol)
        System.out.println ("O resultado de ''"+n1+"^2 + "+n2+"^2 + "+n3+"^2 + "+n4+"^2'' é: "+resultado+".");
    }
    
}