package ro.ase.cts.flyweight.clase;

public class Client implements Flyweight{
	
	private String nume;
	private String nrTelefon;
	private String email;
	
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(toString() + rezervare.toString());
		
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
	}
	
	
	
}
