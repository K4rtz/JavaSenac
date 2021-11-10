
package ifelse001;

import java.util.Scanner;


public class IfElse001 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("___________Exército Militar__________");
        
        System.out.println("\nQual o seu nome: ");
        nome= input.nextLine();
        
        System.out.println("Em que ano você nasceu?");
        idade = input.nextInt();
        
        if (idade >=2004){
            System.out.println("Você não pode se alistar");
        }
        else if (idade <= 2003 ) {
               System.out.println(nome+", Você pode se alistar no Exército");
    }
        else {
                System.out.println("Inválido");
        }
        
         
    }
    
}
