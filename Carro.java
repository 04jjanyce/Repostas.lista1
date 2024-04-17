public class Carro {
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	
	public Carro(String m, String ma, int a, String p) {
		this.modelo = m;
		this.marca = ma;
		this.ano = a;
		this.placa = p;
	}
	
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public int getAno() {
		return ano;
	}
	public String getPlaca(){
		return placa;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	public void setMarca(String ma) {
		this.marca = ma;
	}
	public void setAno(int a) {
		this.ano = a;
	}
	public void setPlaca(String p) {
		this.placa = p;
	}
}
