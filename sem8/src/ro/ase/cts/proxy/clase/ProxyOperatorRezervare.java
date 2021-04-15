package ro.ase.cts.proxy.clase;

public class ProxyOperatorRezervare implements IOperatorRezervari{
	private OperatorRezervari operator;
	private int nrMinPersoane;
	
	@Override
	public void realizeazaRezervare(int nrPersoane) {
		if(nrPersoane>=nrMinPersoane) {
			operator.realizeazaRezervare(nrPersoane);
		}
		else {
			System.out.println("Va rugam veniti fara rezervare");
		}
	}

	public ProxyOperatorRezervare(OperatorRezervari operator, int nrMinPersoane) {
		super();
		this.operator = operator;
		this.nrMinPersoane = nrMinPersoane;
	}
}
