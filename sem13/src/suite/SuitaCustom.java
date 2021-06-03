package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TestGetPromovabilitate;
import categorii.TesteNormale;
import tests.TestGrupa;
import tests.TestGrupaCuFixture;
import tests.TestGrupaWithStudentFake;
import tests.TestGrupaWithStudentStub;

@RunWith(Suite.class)  //@RunWith(Categories.class), cu Suite, nu mai tine cont de exclude
@SuiteClasses({TestGrupaWithStudentStub.class, TestGrupaWithStudentFake.class, TestGrupa.class, SuitaCompleta.class, TestGrupaCuFixture.class})
@IncludeCategory({TestGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class, TesteNormale.class})
public class SuitaCustom {

}
