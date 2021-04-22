package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 4, "10:00");
		Rezervare rezervare2 = new Rezervare(2, 3, "11:00");
		Rezervare rezervare3 = new Rezervare(3, 2, "12:00");
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		flyweightFactory.getClient("0712345").printeazaRezervare(rezervare1);
		flyweightFactory.getClient("0754321").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("0712345").printeazaRezervare(rezervare3);

	}

}
