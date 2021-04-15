package ro.ase.cts.composite;

public interface ComponentaAbstracta {
	
	public void afiseazaDescrierea();
	public void addComponenta(ComponentaAbstracta componentaAbstracta);
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta);
	public ComponentaAbstracta getComponenta(int pozitie);
	
}
