package ro.ase.cts.builderV2;

public class Program {

	public static void main(String[] args) {
		RezervareBuilder builder = new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(5);
		Rezervare rezervare1 = builder.build();
		builder.setCodRezervare(6);
		Rezervare rezervare2 = builder.build();
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		RezervareBuilder builder2 = new RezervareBuilder().setAreScaunErgonomic(true).setCodRezervare(10);
		Rezervare rezervare3 = builder2.build();
		System.out.println(rezervare3.toString());
	}

}
