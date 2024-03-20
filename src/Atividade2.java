
package Aula2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite n1");
        float n1 = input.nextFloat();
        System.out.println("Digite n2");
        float n2 = input.nextFloat();
        
        if(n1 == 0){
            System.out.println("Valor nao é exato");
        }else{
         float calc = n1 % n2;
           if(calc == 0){
               System.out.println("E exato");
           }else{
               System.out.println("Nao e exato");
           }
        }
    }
}
