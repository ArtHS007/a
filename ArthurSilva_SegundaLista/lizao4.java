/**************************************************
Mostra os valores e os troca
Alpha; 29/05/2023
***************************************************/
//Mete o scanner
import java.util.Scanner;
public class lizao4 {
    public static void main (String args[]){
        //inicia o scanner
        Scanner digito = new Scanner(System.in);
        //cria as vars
        Double n1, n2, n3;
        // inicia as vars
        n1 = n2 = n3 = 0.0;
        //usa o scanner
        System.out.println("Digite 2 valores");
        n1 = digito.nextDouble();
        n2 = digito.nextDouble();
        n3 = n1; n1 = n2; n2 = n3;
        //mostra na tela
        System.out.println(n1 + " " + n2);
        
        digito.close();
        }
}
