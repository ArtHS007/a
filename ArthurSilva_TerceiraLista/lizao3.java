/*
Esse código calcula a média de 500 números
Alpha; 30/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class lizao3{
    //Método executado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria as vars que receberão numeros
    int cont=0;
    double somadora = 0.0, media = 0.0;
    //Inicializa as vars
    
    while (cont<500) {
    System.out.println ("Digite um valor");
    int valor = leitor.nextInt();
    somadora += valor;
    cont++;}
    media = somadora/500;
    System.out.println("A média é"+media);
    leitor.close();
    }
    
}