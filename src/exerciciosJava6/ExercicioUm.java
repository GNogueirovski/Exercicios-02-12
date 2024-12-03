package exerciciosJava6;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// Variaveis
		String nomefunc;
		float salario;
		float abono;
		float novosalario;
		
		
		// Puxando o scanner
		Scanner leia = new Scanner(System.in);
		
			
		//Entrada de dados - Nome/Salário/Abono
		
		System.out.println("Insira o seu nome: ");
		nomefunc = leia.nextLine();
		
		System.out.println("Insira seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Insira o abono: ");
		abono = leia.nextFloat();
		
		// Processamento
		novosalario = salario + abono;
		
		leia.close();
				
		// Saída de dados
		System.out.printf("Bom dia %s, seu novo salário é:R$%.2f ",nomefunc, novosalario);
		
		//OUTRAS SOLUÇÕES
		// final String message = String.format("Bom dia %s, seu novo salário é %.2f: ", nomefunc); // IGONES SOLUTION
		// System.out.println(message + novosalario);	// concatenação
		
		



	}

}
