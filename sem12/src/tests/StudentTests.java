package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {
	
	Student student = new Student();

	@Test
	public void testApelCorectConstructorCuParametru() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume()); //inlocuieste if
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume = "Student";
		Student student = new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametru() {
		//Student student = new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		//Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testMarimeListaCorecta() {
		//Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
		//Student student = new Student();
		String nume = "Ion";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

}
