
package media3provas;

import java.util.Scanner;


public class Media3Provas {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String aluno;
        double p1, p2, p3;
        double media;
        
        System.out.println("Olá aluno, Aqui você vera a sua nota do semestre");
        
        System.out.println("\nPrimeiro digite o seu nome:");
        aluno = input.nextLine();
        
        System.out.println("A nota da sua Primeira prova:");
        p1= input.nextDouble();
        
        System.out.println("A nota da sua Segunda prova: ");
        p2 = input.nextDouble();
        
        System.out.println("A nota da sua Terceira, e ultima prova: ");
        p3 = input.nextDouble();
        
        media= (p1 + p2 + p3) /3;
        
        System.out.println("\nEntão," +aluno+ " sua média é de "+media);
                
                
        
        
    }
    
}
