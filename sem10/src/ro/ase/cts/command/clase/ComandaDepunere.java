package ro.ase.cts.command.clase;

public class ComandaDepunere extends Comanda{
	@Override
	public void executa() {
		super.contBancar.depunere(super.suma);
		
	}
	
	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}
}
