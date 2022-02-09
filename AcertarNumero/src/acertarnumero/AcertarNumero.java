/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acertarnumero;

/**
 *
 * @author franc
 */

import java.util.Scanner;
import java.util.Random;

public class AcertarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhido;
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(11);
        
        System.out.println("*****Acerte o Número*****");
        System.out.println("Você só saíra do programa depois de acertar o número.");
        System.out.println("Boa sorte!");
        
        System.out.println("Vamos treinar. Digite um número entre 0 e 10.");
        escolhido = sc.nextInt();
        
        System.out.println("O número gerado foi: " +numero);
        
        System.out.println("Agora que você entendeu, vamos lá!");
        
        while (! (escolhido == numero)){
            System.out.println("Digite um número entre 0 e 10.");
            escolhido = sc.nextInt();
            
            numero = aleatorio.nextInt(11);
            
            System.out.println("O número gerado foi: " +numero);
        }
        
        System.out.println("Parabéns! Você acertou.");
    }
    
}
