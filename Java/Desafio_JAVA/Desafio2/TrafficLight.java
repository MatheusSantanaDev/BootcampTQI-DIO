package Desafio_JAVA.Desafio2;


import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero correspondente a cor do semaforo: ");
        System.out.println("1 - vermelho");
        System.out.println("2 - amarelo");
        System.out.println("3 - verde \n");
        int numero = scanner.nextInt();

        switch(numero){
            case 1:
                System.out.println("Pare! O sinal esta vermelho.");
                break;

            case 2:
                System.out.println("Atençao! O sinal esta amarelo.");
                break;

            case 3:
                System.out.println("Siga em frente! O sinal esta verde.");
                break;

            default:
                System.out.println("Valor invalido!");
                break;
        }

    }
}

