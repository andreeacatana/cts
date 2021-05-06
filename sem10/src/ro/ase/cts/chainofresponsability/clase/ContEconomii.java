package ro.ase.cts.chainofresponsability.clase;

public class ContEconomii extends Handler{

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >=  suma) {
			System.out.println("S-a realizat plata din Contul de economii pentru suma de "+suma);
			super.setSold(getSold()-suma); 
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
