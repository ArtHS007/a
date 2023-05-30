/***************************************************
mostra 1 - 200 e multiplos de 10 aparecem
Alpha; 30/05/2023
***************************************************/
public class lizao5 {
    public static void main(String args[]){
//Cria e inicia a var
    int n1, n2;
    n1 = 0; n2 = 0;
    System.out.println("Digite um número");
    do {
        n1 ++; n2 ++;
        if (n2 == 10){
            System.out.println(n1+" é multiplo de 10");
            n2 = 0;
        }
        else{
            System.out.println(n1);
         }
         } while (n1 < 200);
        
    }
    
}
