
package Aula3;

import java.util.Scanner;


public class ADOCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculadora");
       
        System.out.println("Escolha uma operacão");
        System.out.println("1 Soma");
 
        System.out.println("2 Subtracao");
        
        System.out.println("3 Divisao");
        
        System.out.println("4 Multiplicacao");
       
        int op = input.nextInt();
        
      
        
 
   
   switch(op){
       case 1:
           System.out.println("Digite um numero: ");
           float n1 = input.nextFloat();
             System.out.println("Digite Segundo numero: ");
           float n2 = input.nextFloat();
           
           float calc = n1 + n2;
           System.out.println(calc);
        break;
         case 2:
           System.out.println("Digite um numero: ");
           float nM1 = input.nextFloat();
             System.out.println("Digite Segundo numero: ");
           float nM2 = input.nextFloat();
           
           float calcM = nM1 - nM2;
           System.out.println(calcM);
        break;
          case 3:
           System.out.println("Digite um numero: ");
           float nD1 = input.nextFloat();
             System.out.println("Digite Segundo numero: ");
           float nD2 = input.nextFloat();
           
           float calcD = nD1 / nD2;
           System.out.println(calcD);
        break;
          case 4:
           System.out.println("Digite um numero: ");
           float nML1 = input.nextFloat();
             System.out.println("Digite Segundo numero: ");
           float nML2 = input.nextFloat();
           
           float calcML = nML1 * nML2;
           System.out.println(calcML);
        break;
          default:
              System.out.println("Opcao invalida");
   
   }
        
    }
}
