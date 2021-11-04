
package minicalculadora;

import java.util.Scanner;
        
public class MiniCalculadora {
 

    public static void main(String[] args) {
       //declaração de variaveis
       double x1, x2;
       double soma, subt, mult, divi;
       
       //Biblioteca de interações do usuário
       Scanner entrada = new Scanner(System.in);
       
       //Solicitar ao Usuario os Nº
       System.out.println("---Mini calculadora---");
        System.out.println("\n-Digite um número- ");
        x1 = entrada.nextDouble();
        System.out.println("Digite o segundo número");
         x2 = entrada.nextDouble();
         
         //Especificar o que cada variavel faz
         soma = x1 + x2;
         subt= x1 - x2;
         mult = x1 * x2;
         divi= x1 / x2;
         
         //imprimir na tela o resultado
         System.out.println("A soma dos nº " +x1+ " e " +x2+ " é: "+soma);
         System.out.println("A subtração dos nº " +x1+ " e " +x2+ " é: "+subt);
         System.out.println("A multipilicação dos nº " +x1+ " e " +x2+ " é: "+mult);
        System.out.println("A divisão dos nº " +x1+ " e " +x2+ " é: "+divi);
                 
        
       
        
       
  
    }
    
}
