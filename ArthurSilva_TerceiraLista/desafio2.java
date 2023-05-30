/***************************************************
mostra um numero a quantidade de vezes q ele representa
Alpha; 30/05/2023
***************************************************/
import java.util.Scanner;
public class lizao5 {
    public static void main(String args[]){
//inicia o scanner
    Scanner digito = new Scanner(System.in);
//Cria e inicia a var
    int n1, n2;
    n1 = n2 = 0;
    System.out.println("*Digite um número:");
    n1 = digito.nextInt();
    System.out.println("Você está prester a receber esse número pelo valor que ele vale:");
    n2 = n1; 
    do {
        System.out.println(n1);
        n2 = n2 - 1;
    } while (n2 > 0);
    digito.close();
    }       
}
