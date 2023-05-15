/*
Esse código calcula seu grau de idade 
Alpha (aka peter GRIFFITH); 14/05/2023 
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class linguiciations{
    //Método execuatado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria a var que recebera a idade
    Double n1;
    //Inicializa a var
     n1 = 0.0;

    System.out.println("Insira uma idade ae");
    //idade
    n1 = leitor.nextDouble();
    
     //mostra a idade.
    if (n1>= 65){
        System.out.println ("Pé na cova (idoso)");
    }else if(n1 >= 19 && n1 <= 64){
        System.out.println ("Sofredor (adulto)");
    }else if(n1 >= 12 && n1 <= 18){
        System.out.println ("imbecil (adolescente)");
    }else{
        System.out.println ("beibi/crionça (criança)");
    }
    }
    
}