package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Integer[] vetNumero = new Integer[10];
		Scanner leitura = new Scanner(System.in);
		Integer Menornumero = 9999999, Maiornumero = -9999999;
		
		for (int i = 0; i < 10; i++) {
		Integer numero = Integer.valueOf(leitura.nextLine());
		vetNumero[i] = numero;
		if(numero < Menornumero) {
			Menornumero = numero;
		}
			if(numero > Maiornumero) {
				Maiornumero = numero;
			}
				
			
		}
		
		System.out.println("o Maior Numero é: "+Maiornumero);
		System.out.println("o Menor Numero é: "+Menornumero);

	}

}
