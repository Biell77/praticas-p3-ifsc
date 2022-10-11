package ex8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner (System.in);
        
        String[] lista  = new String[10];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Insira o nome: ");
            
            lista[i] = leitura.nextLine();
        
       
    }
         
        for (int i = 0; i < 4; i++) {
              System.out.println(lista[i]);  
              
        }
        
        System.out.println(lista.length);

        
    }
}
