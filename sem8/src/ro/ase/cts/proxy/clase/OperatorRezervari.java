package ro.ase.cts.proxy.clase;

public class OperatorRezervari implements IOperatorRezervari{

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		System.out.println("A fost realizata rezervare pentru "+nrPersoane+" persoane");	
	}
}
