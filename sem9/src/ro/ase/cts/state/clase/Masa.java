package ro.ase.cts.state.clase;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StareLibera) {
			this.stare = new StareRezervata();
			System.out.println("Ati rezervat masa cu nr "+nrMasa);
		}
		else {
			System.out.println("Masa " +nrMasa +" nu poate sa fie rezervata");
		}
	}
	
	public void ocupaMasa() {
		if(this.stare instanceof StareLibera || this.stare instanceof StareRezervata) {
			this.stare = new StareOcupata();
			System.out.println("Ati ocupat masa cu nr "+nrMasa);
		}
		else {
			System.out.println("Masa " +nrMasa +" nu poate sa fie ocupata");
		}
	}
	
	public void eliberareMasa() {
		if(!(this.stare instanceof StareLibera)) {
			this.stare = new StareLibera();
			System.out.println("Masa "+nrMasa+" este eliberata");
		}
		else {
			System.out.println("Masa este deja libera");
		}
	}
}
