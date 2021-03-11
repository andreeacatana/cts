package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String numeFisier;
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
	
	public AplicantReader(String nume) {
		this.numeFisier = nume;
	}
}
