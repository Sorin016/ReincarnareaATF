package Exercitii;

import io.cucumber.java.be.I;
import io.cucumber.java.sl.In;
import org.joda.time.IllegalInstantException;
import org.testng.IInjectorFactory;

import java.util.*;
import org.testng.annotations.*;


public class Test {
        @DataProvider(name = "valoriAdunare")
        public Object[][] getData() {
            return new Object[][] {
                    {2, 3, 5},
                    {10, 0, 10},
                    {-1, -2, -3}
            };
        }

        @Test(dataProvider = "valoriAdunare")
        public void testAduna(int a, int b, int sumaAsteptata) {
            Calculator calc = new Calculator();
            assert sumaAsteptata == calc.aduna(a, b);
        }
    }

