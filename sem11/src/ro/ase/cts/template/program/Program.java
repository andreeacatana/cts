package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVip;

public class Program {

	public static void main(String[] args) {
		Spectator spectator1 = new Spectator("Ion");
		SpectatorAbstract spectator2 = new Spectator("Vasile");
		
		spectator1.intrareSpectatorStadion();
		System.out.println("----------------------------------");
		spectator2.intrareSpectatorStadion();
		System.out.println("----------------------------------");
		
		SpectatorAbstract spectatorVip = new SpectatorVip("Marian");
		spectatorVip.intrareSpectatorStadion();
		
	}

}
