
package Aula3;

import java.util.Scanner;


public class atividadeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite Tres notas");
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        
        float media = (n1 + n2 +n3)/3;
       
        int nota = 0;
                
        if(media >= 9 && media <= 10){
          nota = 1;

        }else if(media >=8 && media <9){
           nota = 2;
        
         }else if(media >=7 && media <8){
           nota = 3;
          
         }else if(media >=6 && media <7){
           nota = 4;
         
         }else if(media < 5){
           nota = 5;
          
         }
        
         switch(nota){
             case 1:
                 System.out.println("Conceito A");
                 break;
              case 2:
                 System.out.println("Conceito B");
                 break;
                  case 3:
                 System.out.println("Conceito C");
                 break;
                  case 4:
                 System.out.println("Conceito D");
                 break;
                  case 5:
                 System.out.println("Conceito E");
                 break;
                 default:
                     System.out.println("Não encontrado");
         }
        
         
    }
}
