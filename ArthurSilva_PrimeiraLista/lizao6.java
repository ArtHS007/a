/*
Esse código da o valor do perímetro
Alpha (aka treina fofo); 14/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class lingualongasinea{
    //Método executado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria as vars 
    Double n1, resultado;
    //Inicializa as vars
    resultado = n1 = 0.0;

    System.out.println("Insira o valor do raio");
    //dado
    n1 = leitor.nextDouble();
    //Calcula o resultado
    resultado = (2*3.14)*n1;
     //mostra o resultado (lol)
        System.out.println ("O valor do perímetro é : "+resultado+".");
    }
    
}