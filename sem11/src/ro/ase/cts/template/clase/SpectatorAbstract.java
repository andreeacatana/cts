package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	public abstract void asezareCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlComporal();
	public abstract void intraStadion();
	public abstract void ocupaLoc();
	
	public final void intrareSpectatorStadion() {
		
		asezareCoada();
		prezintaBilet();
		realizareControlComporal();
		intraStadion();
		ocupaLoc();
		
	}

}
