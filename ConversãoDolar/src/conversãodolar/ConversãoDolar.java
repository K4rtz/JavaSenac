package conversãodolar;

import java.util.Scanner;

public class ConversãoDolar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double real, dolar, cotacao;

        cotacao = 5.60;
        
        System.out.println("-----Convertor de dolar-----(04/11/2021)");

        System.out.println("Quantos dolares quer converter: ");
        dolar = input.nextDouble();
         
        real = dolar * cotacao;
        
        System.out.println("Você tem " +real+"R$");

    }

}
