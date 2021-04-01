package ro.ase.cts.builder;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rezervare rezervare1 = new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreMancareInclusa(true).setCodRezervare(2).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		//dezavantaj, face shallow copy in acest fel
		/*RezervareBuilder builder = new RezervareBuilder().setAreBauturaRacoritoare(true);
		Rezervare rezervare3 = builder.build();
		Rezervare rezervare4 = builder.setCodRezervare(100).build();
		rezervare3.setCodRezervare(200);
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());*/
	}

}
