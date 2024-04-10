public class Pessoa {
	private int idade;
	private String nome;
	private double altura;
	
	public Pessoa(int i, String n, double a) {
		this.idade = i;
		this.nome = n;
		this.altura = a;
	}

	
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public double getAltura() {
		return altura;
	}

	public void setIdade (int i) {
		this.idade = i;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setAltura (double a) {
		this.altura = a;
	}
	
	public String toString() {
	 return "\nIdade: " + idade + "\nNome: " + nome + "\nAltura: " + altura;
	}
}
	
