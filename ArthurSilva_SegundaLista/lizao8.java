/***************************************************
Esse programa faz umas coisas ae
Alpha; 17/05/2023
***************************************************/
import java.util.Scanner;
public class lizaodoes {
    public static void main(String args[]){
//scanner
    Scanner batata = new Scanner(System.in);
    int no1, no2; double no3; String linha; char chara;
//Analisa os dados
    System.out.println("*Digite seu nome:");    
    linha = batata.nextLine();
    System.out.println("*Digite sua idade:");
    no1 = batata.nextInt();
    System.out.println("*Digite a idade que você quer começar investir:");
    no2 = batata.nextInt();
    no3 = no2 - no1;
//questões
    System.out.println("Essa é a quantidade de tempo que vc vai demorar pra isso: "+no3+" anos.");
    System.out.println("Esta satisfeito? (y/n)");    
    chara = batata.next().charAt(0);
    if (chara == 'Y')
    System.out.println("Ótimo! Mas sugiro que comece o mais rapido possível.");    
    else if(chara == 'N'); 
    System.out.println("Então por que não começar antes? "+linha+", independentemente de qualquer coisa, soraya!");
    
    batata.close();
    }
    
}
