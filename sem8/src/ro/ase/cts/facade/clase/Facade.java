package ro.ase.cts.facade.clase;

public class Facade {
	
	public static boolean potAsezaLaMasa(Masa masa) {
		GestionarMese gestionar = new GestionarMese();
		Picolo picolo = new Picolo();
		
		if(gestionar.esteMasaLibera(masa.getCod())) {
			if(picolo.esteMasaDebarasata(masa.getCod())) {
				if(picolo.areMasaServetele(masa.getCod())) {
					return true;
				}//sau return false dupa fiecare acolada
			}
		}
			return false;

	}
}
