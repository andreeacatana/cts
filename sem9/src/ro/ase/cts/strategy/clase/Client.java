package ro.ase.cts.strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new Portofel();
	}
	
	public void platesteNota(double suma) {
		System.out.println("Clientul "+nume+" are de platit nota ");
		modPlata.plateste(suma);
	}

	//obligatoriu setter
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	

	
}
