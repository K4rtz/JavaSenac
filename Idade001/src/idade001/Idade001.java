
package idade001;

import java.util.Scanner;


public class Idade001 {

   
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        
        int idade;
        String nome;
        
        System.out.println("Olá, qual é o seu nome? ");
        nome= input.nextLine();
        
        System.out.println("Qual a sua idade?");
        idade= input.nextInt();
        
          if (idade <=0){
            System.out.println("Inválido");
          }
          else if (idade<=17){
            System.out.println("Então " +nome+ ", de acordo com a sua idade você é jovem");
        }
          else if (idade <=59){
             System.out.println("Então " +nome+ ", de acordo com a sua idade você é Adulto");
        }
          else if (idade <=110){
            System.out.println("Então " +nome+ ", de acordo com a sua idade você é Idoso");
        }
          else{
              System.out.println("Inválido");
          }
    }
    
}
        