
package while02;

import java.util.Scanner;


public class While02 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int opcao = 0;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Iniciar jogo");
            System.out.println("2- Ajuda");
            System.out.println("3-Sair");
            System.out.println("OPCÃO: ");
            opcao = input.nextInt();
        }while (opcao !=3);
        System.out.println("Programa Finalizado");
        
        }
                
        
    }
    

