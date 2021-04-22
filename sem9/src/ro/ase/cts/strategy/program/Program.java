package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Popescu");
		client.setModPlata(new Card());
		client.platesteNota(200);
		client.setModPlata(new Portofel());
		client.platesteNota(150);
	}

}
