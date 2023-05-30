/**************************************************
Esse programa mostra o valor original e ele com 15%
Alpha; 17/05/2023
***************************************************/
//Mete o scanner
import java.util.Scanner;
public class lizaoum {
    public static void main (String args[]){
        //inicia o scanner
        Scanner digito = new Scanner(System.in);
        //cria as vars
        Double Valor, Valor_desconto;
        // inicia as vars
        Valor = Valor_desconto = 0.0;
        //usa o scanner
        System.out.println("Digite um valor");
        Valor = digito.nextDouble();
        Valor_desconto = Valor - Valor/0.15;
        //mostra na tela
        System.out.println("O valor "+Valor+" com 15% de desconto ficou "+Valor_desconto+".");
        
        digito.close();
        }
}
