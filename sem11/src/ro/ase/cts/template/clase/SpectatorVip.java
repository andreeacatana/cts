package ro.ase.cts.template.clase;

public class SpectatorVip extends SpectatorAbstract{
	
	private String numeVip;
	
	public SpectatorVip(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVip + " se prezinta direct la usa");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVip + " prezinta bilet VIP");
	}

	@Override
	public void realizareControlComporal() {
		System.out.println(numeVip + " realizeaza control VIP");
	}

	@Override
	public void intraStadion() {
		System.out.println(numeVip + " intra in loja VIP");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVip + " ocupa loc VIP");
		
	}

}
