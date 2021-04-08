package ro.ase.cts.adapter.obiecte;

public class Program {
	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		Leasing leasing = new Leasing("Popescu");
		LeasingAdapter adapter = new LeasingAdapter(leasing);
		afiseazaInformatiiCredit(adapter);
	}

}
