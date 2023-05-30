/***************************************************
Esse programa mostra os numeros entre 2 numeros
Alpha; 30/05/2023
***************************************************/
import java.util.Scanner;
public class lizao2 {
    public static void main(String args[]){
    Scanner batata = new Scanner(System.in);
    int no1, no2;
    no1 = no2 = 0;
    System.out.println("Digite 2 valores:");
    no1 = batata.nextInt();
    no2 = batata.nextInt();
    System.out.println("Esses são os números entre "+no1+" e "+no2+".");
    do {
    no1++;
    System.out.println(no1);
    } while (no1 < (no2-1));

    batata.close();
    }
    
}
