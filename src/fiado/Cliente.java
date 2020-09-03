package fiado;

public class Cliente {
	
	private String nome;
	private String telefone;
	private int[] fiados;
	private int posicao = 0;
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.fiados = new int[10];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getFiados() {
		int total = 0;
		for (int fiado: fiados) {
			total += fiado;
		}
		return total;
	}

	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	
}
