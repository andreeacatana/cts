package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Program {

	public static void main(String[] args) {
		/*GestionarMese gestionar = new GestionarMese();
		Picolo picolo = new Picolo();
		Masa masa = new Masa(12, 4);
		
		if(gestionar.esteMasaLibera(masa.getCod())) {
			if(picolo.esteMasaDebarasata(masa.getCod())) {
				if(picolo.areMasaServetele(masa.getCod())) {
					System.out.println("Poftiti la masa cu codul "+masa.getCod());
				}
				else
					System.out.println("Mai asteptati putin.");
			}
			else
				System.out.println("Mai asteptati putin.");
		}
		else
			System.out.println("Mai asteptati putin.");*/
		
		Masa masa = new Masa(12, 4);
		if(Facade.potAsezaLaMasa(masa)) {
			System.out.println("Poftiti la masa "+masa.getCod());
		}
		else {
			System.out.println("Mai asteptati");
		}

	}

}
