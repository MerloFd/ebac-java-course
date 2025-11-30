package br.com.merlo.test;

import br.com.merlo.tdd.ContratoServiceTest;
import br.com.merlo.testapp.ClienteServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class})
public class AllTests {
}
