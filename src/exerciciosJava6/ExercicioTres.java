package exerciciosJava6;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// Variaveis
		String nomefunc;
		float salariob, salariol, adicionaln, horae, desc;
		
		
		// Puxando o scannerI
		Scanner leia = new Scanner(System.in);
		
			
		//Entrada de dados - Nome funcionário e inserções salariais
		System.out.println("Insira o nome do funcionário: ");
		nomefunc = leia.nextLine();
		
		System.out.println("Insira o salário bruto: ");
		salariob = leia.nextFloat();
		
		System.out.println("Insira o adicional noturno: ");
		adicionaln = leia.nextFloat();
		
		System.out.println("Insira as horas extra: ");
		horae = leia.nextFloat();
		
		System.out.println("Insira os descontos: ");
		desc = leia.nextFloat();
		
		// Processamento
		
		salariol = salariob + adicionaln + (horae*5) - desc;
		leia.close();
				
		// Saída de dados
		System.out.printf("O salário líquido de %s é de R$%.2f", nomefunc, salariol);	// concatenação

	}

}
