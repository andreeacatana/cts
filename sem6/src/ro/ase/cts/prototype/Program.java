package ro.ase.cts.prototype;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContClient client = new ContClient("Ion", 18);
		ContClient client2 = (ContClient) client.copiaza();
		
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		Bilet bilet1 = new Bilet(1, "Arsenal", "Liverpool", "1Martie","1F");
		Bilet bilet2 = new Bilet(2, "Read Madrid", "Barcelona", "2Martie","2F");
		
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCodBilet(3);
		bilet3.setLoc("3F");
		
		Bilet bilet4 = (Bilet) bilet1.copiaza();
		bilet4.setCodBilet(4);
		bilet4.setLoc("4F");
		
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());
	}

}
