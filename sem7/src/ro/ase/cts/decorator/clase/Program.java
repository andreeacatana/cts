package ro.ase.cts.decorator.clase;

public class Program {

	public static void main(String[] args) {
		CardAbstract card = new Card("Ionescu");
		card.realizeazaPlataNormala();
		card.realizeazaPlataOnline();
		
		DecoratorAbstract decoratorAbstract = new DecoratorContactless(card);
		decoratorAbstract.realizeazaPlataContactless();
		decoratorAbstract.realizeazaPlataNormala();
		decoratorAbstract.realizeazaPlataOnline();
	}

}
