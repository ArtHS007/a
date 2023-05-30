/***************************************************
Esse programa mostra 3 numeros e o maior entre eles 
Alpha; 17/05/2023
***************************************************/
import java.util.Scanner;
public class lizaodoes {
    public static void main(String args[]){
    Scanner batata = new Scanner(System.in);
    double no1, no2, no3;
    no1 = no2 = no3 = 0.0;
    System.out.println("Digite um valor");
    no1 = batata.nextDouble();
    no2 = batata.nextDouble();
    no3 = batata.nextDouble();

    if (no1 > no2 && no1 > no3){
        System.out.println("O maior número é "+no1);   
    } else if (no2 > no1 && no2 > no3){
        System.out.println("O maior número é "+no2);
    } else if (no3 > no1 && no3 > no2){
    System.out.println("O maior número é "+no3);
    }else if (no1 == no2 && no2 == no3) {System.out.println("Erro: NÃO HÁ NUMERO MAIOR EM NÚMEROS IGUAIS.");    
    }
    
    batata.close();
    }
    
}
