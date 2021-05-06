package ro.ase.cts.command.clase;

public abstract class Comanda {
	protected ContBancar contBancar; //protected in loc de private, ca sa nu mai facem getter
	protected float suma;
	
	public Comanda(ContBancar contBancar, float suma) {
		super();
		this.contBancar = contBancar;
		this.suma = suma;
	}
	
	public abstract void executa();
	
	
}
