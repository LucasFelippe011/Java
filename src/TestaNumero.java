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
public class TestaNumero {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
    
    System.out.println("testa numero");
    System.out.println("Numero: ");
    int n = input.nextInt();
    
    
    //Criando teste para ter o resultado
    
    if(n > 0){
        System.out.println(n + " é Positivo");
    }else if(n < 0){
        System.out.println(n+ " é Negativo");
    }else{
        System.out.println(n + " é Zero");
    }
    
   
    }
}
