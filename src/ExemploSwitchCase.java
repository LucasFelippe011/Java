
package Aula3;

import java.util.Scanner;


public class ExemploSwitchCase {
    public static void main(String[] args) {
        char grade = 'M';
        switch(grade){
            case 'A':
                System.out.println("Conceito A");
            break;
            case 'B': //Se tiver desse jeito eles são a mesma opção
            case 'C':
                System.out.println("Conceito B\nConceito C");
               break;
            case 'D':
            System.out.println("Conceito D"); // D e o E sao da mesma casa pode nao tem o break.
            case 'E':
                System.out.println("Conceito E");
                break;
             default: // É uma opção no caso de nada ser selecionado.
                 System.out.println("Nenhum Selecionado");
    };
    }
}
