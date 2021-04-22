package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("A fost realizata plata cu cardul pentru suma de "+sumaPlatita);
		
	}

}
