package bootstrap_theme.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import bootstrap_theme.TestCases.AddCostumerTestCase;

@RunWith(Suite.class)

@SuiteClasses({
	
	AddCostumerTestCase.class,
	AddCostumerTestCase.class	
})	
public class AllTests {
	
}