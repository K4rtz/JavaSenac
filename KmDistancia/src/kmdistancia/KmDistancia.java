package kmdistancia;

import java.util.Scanner;

public class KmDistancia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kmInicial, kmFinal, kmTotal, litros, consumo;

        System.out.println("--Digite a quilometragem Inicial: ");
        kmInicial = input.nextDouble();

        System.out.println("--Digite a quilometragem Finak: ");
        kmFinal = input.nextDouble();

        kmTotal = kmFinal - kmInicial;

        System.out.println("\nInforme a quantidade de litros consumidos: ");
        litros = input.nextDouble();

        consumo = kmTotal / litros;

        System.out.println("-----Você percorreu o total de " + kmTotal + "KM----");
        
        System.out.println("----A sua média é" +consumo);

    }

}
