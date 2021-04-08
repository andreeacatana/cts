package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract{
	private String detinator;

	public Card(String detinator) {
		super();
		this.detinator = detinator;
	}

	public String getDetinator() {
		return detinator;
	}

	@Override
	public void realizeazaPlataOnline() {
		System.out.println(detinator +" face plata online");
		
	}

	@Override
	public void realizeazaPlataNormala() {
		System.out.println(detinator +" face plata normal");
		
	}
	
	
}
