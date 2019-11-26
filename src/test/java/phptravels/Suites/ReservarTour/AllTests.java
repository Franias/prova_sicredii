package phptravels.Suites.ReservarTour;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import phptravels.TestCases.ReservarTour.ReservarTestCase;


@RunWith(Suite.class)

@SuiteClasses({
	
	ReservarTestCase.class,
	ReservarTestCase.class	
})

public class AllTests {
	
}
