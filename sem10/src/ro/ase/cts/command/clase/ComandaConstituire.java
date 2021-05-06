package ro.ase.cts.command.clase;

public class ComandaConstituire extends Comanda{
	
	@Override
	public void executa() {
		super.contBancar.constituire(super.suma);
		
	}
	
	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

}
