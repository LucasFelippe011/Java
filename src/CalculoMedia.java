/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

import java.util.Scanner;

/**
 *
 * @author lucas.fsiqueira2
 */
public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculo de Media");
        
        //Entradas de dados
        System.out.println("Digite Primeira nota: ");
        float n1 = input.nextFloat();
        System.out.println("Digite Segunda nota: ");
        float n2 = input.nextFloat();
        System.out.println("Digite terceira nota: ");
        float n3 = input.nextFloat();
        
        //Processamento
        float media = (n1 + n2 + n3) /3;
        
        //Saida de dados
        System.out.printf("Sua nota: "+ media);
        
        
         if(media >= 6){
            System.out.println(" Aprovado");
        }else{
         System.out.println(" Reprovado");
        };
        
        
        
        
        
    }
}
