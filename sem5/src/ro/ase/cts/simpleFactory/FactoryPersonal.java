package ro.ase.cts.simpleFactory;

public class FactoryPersonal {
	
	public static PersonalSpital createPersonal(TipPersonal tip, String nume, int salariu) throws Exception {
		switch(tip) {
		case Medic: return new Medic(nume, salariu);  /*fara break pt ca am return */
		case Asistent: return new Asistent(nume, salariu); 
		case Brancardier: return new Brancardier(nume, salariu);
		default: throw new Exception();
		}
	}
}
