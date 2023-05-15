/*
Esse código passa o real pro dolar
Alpha (aka cabeça de gelo); 14/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class lingualongasinea{
    //Método executado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria a var que recebe o valor
    Double n1, resultado;
    //Inicializa as var
    resultado = n1 = 0.0;

    System.out.println("Insira o valor do real");
    //Número
    n1 = leitor.nextDouble();
    //Calcula o resultado
    resultado = n1/4.92;
     //mostra o resultado (lol)
        System.out.println ("A conversão dá exatos $"+resultado+".");
    }
    
}