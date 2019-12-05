package bootstrap_theme.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import bootstrap_theme.TestCases.SaveCostumerTestCase;

@RunWith(Suite.class)

@SuiteClasses({
	
	SaveCostumerTestCase.class
})	
public class AllTests {
	
}