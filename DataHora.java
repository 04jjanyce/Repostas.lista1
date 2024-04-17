public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora(Data d, Hora h) {
		this.data = d;
		this.hora = h;
	}
	
	public Data getData() {
		return data;
	}
	public void setData(Data d) {
		this.data = d;
	}
	
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora h) {
		this.hora = h;
	}
	
	public String imprimirDados() {
		return "Data: " + data.imprimirData() + "\nHora: " + hora.imprimirHora();
		}
}
