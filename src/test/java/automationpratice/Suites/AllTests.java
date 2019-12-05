package automationpratice.Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import automationpratice.TestCases.BuyProductTestCase;

@RunWith(Suite.class)

@SuiteClasses({
	
	BuyProductTestCase.class
})	
public class AllTests {
	
}