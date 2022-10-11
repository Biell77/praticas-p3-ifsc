package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Double Nota1, Nota2, Nota3, Media = 0.0;

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        // leituras scanf
        System.out.println("Digite a primeira nota : ");
        String nota1 = leitura.nextLine();
        System.out.println("Digite a segunda nota : ");
        String nota2 = leitura.nextLine();
        System.out.println("Digite a terceira nota : ");
        String nota3 = leitura.nextLine();

       
        Nota1 = Double.valueOf(nota1);
        Nota2 = Double.valueOf(nota2);
        Nota3 = Double.valueOf(nota3);

        Media = (Nota1 + Nota2 + Nota3) / 3;

        
        System.out.println(nome + ", a sua Media sera = " + Media);
    }

}
