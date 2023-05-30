/***************************************************
Esse programa mostra o sucessor e antecessor de um número 
Alpha; 17/05/2023
***************************************************/
import java.util.Scanner;
public class lizao5 {
    public static void main(String args[]){
//mete o scanner
    Scanner batata = new Scanner(System.in);
//Cria e inicia a var
    double no1;
    no1 = 0.0;
    System.out.println("Digite um número");
    no1 = batata.nextDouble();
    System.out.println("O número ''"+no1+"'' tem como antecessor ''"+(no1-1)+"'' e como sucessor ''"+(no1+1)+"''.");    
    batata.close();
    }
    
}
