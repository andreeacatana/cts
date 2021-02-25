package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
private List<Animal> lista;
private Zookeeper zookeeper;

public Zoo(List<Animal> lista, Zookeeper zookeeper) {
	super();
	this.lista = lista;
	this.zookeeper = zookeeper;
}

public Zoo() {
	super();
	lista = new ArrayList<Animal>();
}

public void add(Animal animal) {
	lista.add(animal);
}

public void feedAll() {
	for(Animal animal : lista) {
		zookeeper.feed(animal);
	}
}

public List<Animal> getLista() {
	return lista;
}

public void setLista(List<Animal> lista) {
	this.lista = lista;
}

public Zookeeper getZookeeper() {
	return zookeeper;
}

public void setZookeeper(Zookeeper zookeeper) {
	this.zookeeper = zookeeper;
}



}
