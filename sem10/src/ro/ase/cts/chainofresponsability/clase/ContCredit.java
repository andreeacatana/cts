package ro.ase.cts.chainofresponsability.clase;

public class ContCredit extends Handler{

	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >=  suma) {
			System.out.println("S-a realizat plata din Contul de credit pentru suma de "+suma);
			super.setSold(getSold()-suma); 
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
