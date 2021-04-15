package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.ProxyOperatorRezervare;

public class Program {

	public static void main(String[] args) {
		OperatorRezervari operatori = new OperatorRezervari();
		operatori.realizeazaRezervare(2);
		
		ProxyOperatorRezervare proxyOperator = new ProxyOperatorRezervare(operatori, 4);
		proxyOperator.realizeazaRezervare(2); //face rezervare pt min 4 pers
	}

}
