package br.senai.sp.morumbi;

import java.util.Scanner;

public class EntradaMorumbi {
    public static void main(String[] args) {

        String nome ;
        int idade, corCamisa;

        Scanner teclado = new Scanner(System.in);

        /** Coletar Dados */

        System.out.println("----------------------------------------");
        System.out.println("Boa Tarde! Bem Vindo ao Morumbi!");
        System.out.print("Informe seu Nome: ");
        nome = teclado.next();
        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Informe a cor da sua Camisa (1- Azul 2- Branca 3- Vermelha 4-Preta 5- Amarela 6- Rosa): ");
        corCamisa = teclado.nextInt();

        switch(corCamisa){
            case 1:
                System.out.println("Arquibancada A");
            break;

            case 2:
                System.out.println("Arquibancada B");
                break;

            case 3:
                System.out.println("Arquibancada C");
                break;

            case 4:
                System.out.println("Arquibancada D");
                break;

            case 5:
                System.out.println("Arquibancada E");
                break;

            case 6:
                System.out.println("Arquibancada F - Com Desconto!!");
                break;

            default:
                System.out.println("Não Entra!");


        }






    }
}
