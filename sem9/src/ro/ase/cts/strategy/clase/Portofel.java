package ro.ase.cts.strategy.clase;

public class Portofel implements ModPlata {

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("A fost realizata plata cash pentru suma de "+sumaPlatita);
		
	}

}
