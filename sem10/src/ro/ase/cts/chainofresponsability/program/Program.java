package ro.ase.cts.chainofresponsability.program;

import ro.ase.cts.chainofresponsability.clase.ContCredit;
import ro.ase.cts.chainofresponsability.clase.ContCurent;
import ro.ase.cts.chainofresponsability.clase.ContEconomii;
import ro.ase.cts.chainofresponsability.clase.Handler;
import ro.ase.cts.chainofresponsability.clase.RefuzaTranzactia;

public class Program {

	public static void main(String[] args) {
		Handler contCurent = new ContCurent(2000);
		Handler contCredit = new ContCredit(5000);
		Handler contEconomii = new ContEconomii(2100);
		Handler refuzaTranzactia = new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		
		contCurent.realizeazaPlata(2050);
		
	}

}
