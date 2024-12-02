package exerciciosJava;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// Variaveis
		float n1, n2, n3, n4;
		float diferenca;
		
		
		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);
		
			
		//Entrada de dados - numeros a serem calculados a diferença
		
		System.out.println("Insira o primeiro número ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira a segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira a terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira a quarto número: ");
		n4 = leia.nextFloat();
		
		// Processamento
		diferenca = (n1*n2) - (n3*n4);
				
		// Saída de dados
		System.out.printf("A diferença é: %.1f ", diferenca);	// concatenação

	}

}
