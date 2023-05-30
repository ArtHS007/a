/*
Esse código soma four numbers
Alpha; 29/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class linguilinguossosa{
    //Método executado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria as vars que receberão numeros
    Double n1, n2, n3, n4, soma;
    //Inicializa as vars
    soma = n1 = n2 = n3 = n4 = 0.0;

    System.out.println("Insira 4 números");
    //Números
    n1 = leitor.nextDouble();
    n2 = leitor.nextDouble();
    n3 = leitor.nextDouble();
    n4 = leitor.nextDouble();
    //Calcula a soma
    soma = n1 + n2 + n3 + n4;
     //mostra o resultado (lol)
        System.out.println ("A soma de ''"+n1+" + "+n2+" + "+n3+" + "+n4+"'' é: "+soma+".");
    }
    
}