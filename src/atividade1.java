
package Aula2;

import java.util.Scanner;


public class atividade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n1 = input.nextInt();
        
        if(n1 > 100){
         int calc = n1 + 150;
            System.out.println("Seu numero agora é: "+ calc);
        }else{
         System.out.println(n1+ " Seu numero ");
        }
        
    }
}
