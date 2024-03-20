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
public class VerificaMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Verifica maior");
        
        System.out.println("N1:");
        int n1 = input.nextInt();
        System.out.println("N2:");
        int n2 = input.nextInt();
        System.out.println("N3:");
        int n3 = input.nextInt();
        
        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " N1 é maior");
        }else if(n2> n1 && n2 > n3){
            System.out.println(n2 + " N2 é maior ");
        }else if(n3 > n1 && n3 > n2){
            System.out.println(n3 +" N3 é maior ");
        }else{
            System.out.println("Iguais");
        }
        
        
        
    }
}
