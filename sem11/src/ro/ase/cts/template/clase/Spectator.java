package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract{
	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spectatorul "+nume+" se aseaza la coada");
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul "+nume+" prezinta biletul");
	}

	@Override
	public void realizareControlComporal() {
		System.out.println("Spectatorul "+nume+" este controlat corporal");
	}

	@Override
	public void intraStadion() {
		System.out.println("Spectatorul "+nume+" intra pe stadion");
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+nume+" ocupa locul");
	}
	
	
}
