package ro.ase.cts.facade;

public class Program {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Maricica","2990506395969");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					System.out.println("I se ofera creditul lui " + persoana.getNume());
				}
			}
		}
		
		Persoana persoana2 = new Persoana("Ion","2990506395978");
		if(Facade.esteAptaPersoana(persoana2))
			System.out.println("I se ofera creditul lui " + persoana.getNume());
		else
			System.out.println("Nu i se ofera creditul lui " + persoana.getNume());
			
	}

}
