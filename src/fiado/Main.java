package fiado;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o telefone do cliente: ");
		String telefone = scanner.nextLine();
		Cliente cliente = new Cliente(nome, telefone);
		
		System.out.println("Informe o valor da compra: ");
		int valor = Integer.valueOf(scanner.nextLine());
		
		while (valor != -1) {
			if (valor > 0) {
				cliente.registrarFiado(valor);
			} else {
				System.out.println("Valor inválido, tente novamente");
			}
			
			System.out.println("Informe o valor da próxima compra (-1 para cancelar): ");
			valor = Integer.valueOf(scanner.nextLine());
		}
		
		int total = cliente.getFiados();
		
		if (total > 100) {
			System.out.println("Cliente: " + cliente.getNome() + "\nTelefone: " 
					+ cliente.getTelefone() + "\ngastou: " + total + " reais" + " ==> ganhou brinde!!");
		} else {
			System.out.println("Cliente: " + cliente.getNome() + "\nTelefone: " 
					+ cliente.getTelefone() + "\ngastou: " + total + " reais");
		}
		
		scanner.close();
	}
	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		
		return total;
	}
	
	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];
		}
		
		return total;
	}
	
	public static int somaForEach(int[] fiados) {
		int total = 0;
		for (int fiado: fiados) {
			total += fiado;
		}
		
		return total;
	}
}

