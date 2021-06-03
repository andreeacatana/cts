package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestGrupa;
import tests.TestGrupaWithStudentFake;
import tests.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithStudentStub.class, TestGrupaWithStudentFake.class, TestGrupa.class})
public class SuitaCompleta {

}
