package exerciciosJava;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// Variaveis
		String nomealuno;
		float n1, n2, n3, n4;
		float media;
		
		
		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);
		
			
		//Entrada de dados - Nome aluno e notas
		System.out.println("Insira o nome do aluno: ");
		nomealuno = leia.nextLine();
		
		System.out.println("Insira a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira a quarta nota: ");
		n4 = leia.nextFloat();

		
		// Processamento
		media = (n1+n2+n3+n4) / 4;
		leia.close();
				
		// Saída de dados
		System.out.printf("A média do aluno %s é: %.1f ",nomealuno, media);	// concatenação

	}

}
