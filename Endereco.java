public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String r, int n, String c, String b, String ci, String e,
			String ce) {
		this.rua = r;
		this.numero = n;
		this.complemento = c;
		this.bairro = b;
		this.cidade = ci;
		this.estado = e;
		this.cep = ce;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String r) {
		this.rua = r;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int n) {
		this.numero = n;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String c) {
		this.complemento = c;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String b) {
		this.bairro = b;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String c) {
		this.cidade = c;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String e) {
		this.estado = e;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String ce) {
		this.cep = ce;
	}

}
