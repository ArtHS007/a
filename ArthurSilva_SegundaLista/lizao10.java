/**************************************************
Pega um número de 94 a 456 e diz q acertou LOL.
Alpha; 17/05/2023
***************************************************/
//Mete o scanner
import java.util.Scanner;
public class lizaoum {
    public static void main (String args[]){
        //inicia o scanner
        Scanner digito = new Scanner(System.in);
        //cria a var
        int Valor;
        // inicia a var
        Valor = 0;
        //usa o scanner
        System.out.println("Digite um valor");
        Valor = digito.nextDouble();
        if (valor >= 94)
        System.out.println("Acertou.");
        else {
            System.out.println("Errou.");
        }
        
        digito.close();
        }
}
