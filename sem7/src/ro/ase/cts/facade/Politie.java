package ro.ase.cts.facade;

public class Politie {
	public static boolean esteUrmaritDePolitie(Persoana p) {
		int cifra = Integer.parseInt(""+p.getCnp().charAt(12));
		return cifra%2==0;
	}

}
