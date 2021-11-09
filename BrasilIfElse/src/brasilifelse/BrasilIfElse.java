
package brasilifelse;

import java.util.Scanner;


public class BrasilIfElse {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        String nome,pais;
        
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        
        System.out.println("Digite o seu país: ");
        pais = input.nextLine();
        
        
        if (pais.equals("Brasil")  || pais.equals("brasil")) {
            System.out.println(nome+", Você é brasileiro");
        }
        else 
            System.out.println(nome+", Você é estrangeiro");
    
        
        }
                
 
    }
    

