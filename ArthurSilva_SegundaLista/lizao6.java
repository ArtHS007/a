/*
Esse código calcula picolés
Alpha; 29/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class lizao6{
    //Método executado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria as vars que receberão numeros
    int ki, la, ro;
    Double res;
    //Inicializa as vars
    ki = la = ro = 0;
    res = 0.0;
    //Quantidades
    System.out.println ("Digite a quantidade de Sorvetes de Kiwi.");
    ki = leitor.nextInt();
    System.out.println ("Digite a quantidade de Sorvetes de Laranja.");
    la = leitor.nextInt();
    System.out.println ("Digite a quantidade de Sorvetes de Romãs.");
    ro = leitor.nextInt();
    //Calcula a soma
    res = (ki*3.20)+(2.39)+(7.99);
     //mostra o resultado (lol)
        System.out.println ("Valor a pagar: R$"+res+".");
    }
    
}