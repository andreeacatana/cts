package ro.ase.cts.adapter.clase;

public class Program {
	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		LeasingAdapterClase leasingAdapterClase = new LeasingAdapterClase("Popescu");
		afiseazaInformatiiCredit(leasingAdapterClase);

	}

}
