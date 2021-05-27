package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupa {
	
	private Grupa grupa;
	
	@Before
	public void setUp() {
		grupa = new Grupa(1077);
		for(int i=0;i<10;i++) {
			Student stud = new Student("Marcel");
			stud.adaugaNota(5);
			stud.adaugaNota(10);
			stud.adaugaNota(4);
			grupa.adaugaStudent(stud);
		}
	}
	
	@Test
	public void getPromovabilitateRight() {
		Student student1 = new Student("Marcel");
		student1.adaugaNota(10);
		student1.adaugaNota(10);
		
		Student student2 = new Student("Maria");
		student2.adaugaNota(10);
		student2.adaugaNota(10);
		
		grupa.adaugaStudent(student1);
		grupa.adaugaStudent(student2);
		
		assertEquals(0.16, grupa.getPromovabilitate(),0.05);
	}
	
	@Test
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupaNoua = new Grupa(1076);
		Student student1=new Student("Ion");
		student1.adaugaNota(10);
		student1.adaugaNota(10);
		
		Student student2=new Student("Ioana");
		student2.adaugaNota(10);
		student2.adaugaNota(10);
		
		grupaNoua.adaugaStudent(student1);
		grupaNoua.adaugaStudent(student2);
		
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaa = new Grupa(1080);
		grupaa.getPromovabilitate();
	}
	
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic() {
		int nrGrupa=100;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa=1102;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}

}
