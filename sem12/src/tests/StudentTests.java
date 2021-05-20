package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {
	
	Student student = null;
	
	@Before
	public void setUp() {
		student = new Student();
	}

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
	
	@Test
	public void testCalculMedie() {
		int nota1 = 8;
		int nota2 = 9;
		float medie = (nota1+nota2)/2.0f;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculMediePentruONota() {
		int nota=9;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testVerificareRestante() {
		int nota1=4;
		int nota2=6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestante() {
		int nota1=8;
		int nota2=6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNota() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptie() {
		int index = -1;
		student.getNota(index);
	}
	
	@Test
	public void testGetNotaShouldThrowException() {
		//1
		try {
			//2
			student.getNota(-1);
			//3
			fail("nu trebuia sa ajunga aici");
		} catch(IndexOutOfBoundsException err) {
		//4
		}
		//5
	}

}
