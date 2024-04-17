public class Disciplina {
	private String nome;
	private int codigo;
	public Disciplina(String n, int c) {
		this.nome = n;
		this.codigo = c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int c) {
		this.codigo = c;
	}
		
}
