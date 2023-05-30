/**************************************************
Mostra os valores impares entre 0 e 1000
Alpha; 30/05/2023
***************************************************/
//Mete o scanner
import java.util.Scanner;
public class lizao4 {
    public static void main (String args[]){
        //inicia o scanner
        Scanner digito = new Scanner(System.in);
        //cria as vars
        int n1;
        // inicia as vars
        n1 = 1;
        //usa o scanner
        do {
        System.out.println(n1);
        n1 ++; n1++;
        } while (n1 < 1000);
        //mostra na tela
        
        digito.close();
        }
}
