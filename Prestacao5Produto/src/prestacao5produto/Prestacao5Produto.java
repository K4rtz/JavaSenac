
package prestacao5produto;

import java.util.Scanner;


public class Prestacao5Produto {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        int prestacoes = 5;
        double parcela, compra;
        
        System.out.println("O item pode ser parcelado em 5 vezes");
        
        System.out.println("\nQual o valor do produto: ");
        compra = input.nextDouble();
        
        parcela = compra / prestacoes;
                
        System.out.println("O preço da parcela vai ser "+ parcela +"R$");
        
        
                
                
    }
    
}
