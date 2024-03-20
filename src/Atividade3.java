/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sua Altura: ");
        float alt = input.nextFloat();
        System.out.println("Seu peso: ");
        float peso = input.nextFloat();
        
        float massa = peso / (alt*alt);
        
        if(massa < 26){
            System.out.println("Normal");
        }else if(massa >= 26 && massa < 30){
            System.out.println("Obeso");
        }else if(massa >= 30){
            System.out.println("Obeso morbido");
        }
    }
}
