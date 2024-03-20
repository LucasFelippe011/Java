
package Aula3;

import java.util.Scanner;

public class AulaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu de escolhas\nEscolha uma opcao\n1:Espada\n2;Armadura");
        int e = input.nextInt();
        
        switch(e){
         case 1:
             System.out.println("Espada");
        break; 
          case 2:
             System.out.println("Armadura");
        break; 
        
        
        
        };
        
    }
}
