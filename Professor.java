public class Professor {
	private String nome;
	private String departamento;
	private String titulacao;
	
	public Professor(String n, String d, String t) {
		this.nome = n;
		this.departamento = d;
		this.titulacao = t;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String d) {
		this.departamento = d;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String t) {
		this.titulacao = t;
	}
	
}
