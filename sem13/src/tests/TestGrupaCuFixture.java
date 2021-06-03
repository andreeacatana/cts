package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TestGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;

public class TestGrupaCuFixture {

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
	@Category({TestGetPromovabilitate.class})
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
	@Category({TestGetPromovabilitate.class, TesteUrgente.class})
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	@Category({TestGetPromovabilitate.class, TesteNormale.class})
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
	
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
