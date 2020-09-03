import java.util.Scanner;

public class Fiado {
	public static void main(String[] args) {
		int fiados[] = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		
		System.out.println("Informe o valor da compra: ");
		int valor = Integer.valueOf(scanner.nextLine());
		int i = 0;
		while (valor != -1) {
			if (valor > 0) {
				fiados[i] = valor;
			} else {
				System.out.println("Valor inválido, tente novamente");
			}
			
			System.out.println("Informe o valor da próxima compra (-1 para cancelar): ");
			valor = Integer.valueOf(scanner.nextLine());
			i++;
		}
		
		int total = somaForEach(fiados);
		
		if (total > 100) {
			System.out.println(nome + " gastou: " + total + " ==> ganhou brinde!!");			
		} else {
			System.out.println(nome + " gastou: " + total);
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

