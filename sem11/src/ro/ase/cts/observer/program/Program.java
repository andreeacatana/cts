package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientFidel;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
		Observer c1 = new ClientFidel("Gigel");
		Observer c2 = new ClientFidel("Ion");
		Observer c3 = new ClientFidel("Maria");
		Observer c4 = new ClientFidel("Florin");
		
		ManagerSala manager = new ManagerSala();
		
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);
		
		manager.anuntaMeci("Forbal");
		
		System.out.println();
		manager.stergeAbonat(c2);
		manager.anuntaMeci("Handbal");
	}

}
