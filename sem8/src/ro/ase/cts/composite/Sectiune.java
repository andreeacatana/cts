package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{
	
	private String denumire;
	List<ComponentaAbstracta> optiuni;
	
	@Override
	public void afiseazaDescrierea() {
		System.out.println("Sectiunea "+denumire);
		for(ComponentaAbstracta optiune : optiuni) {
			optiune.afiseazaDescrierea();
		}
		
	}
	@Override
	public void addComponenta(ComponentaAbstracta componentaAbstracta) {
		optiuni.add(componentaAbstracta);	
	}
	
	@Override
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
		optiuni.remove(componentaAbstracta);
	}
	
	@Override
	public ComponentaAbstracta getComponenta(int pozitie) {
		if(pozitie>0 && pozitie<optiuni.size()) {
			return optiuni.get(pozitie);
		}
		return null;
	}
	
	public Sectiune(String denumire) {
		super();
		this.denumire = denumire;
		optiuni = new ArrayList<>();
	}
	
	
}
