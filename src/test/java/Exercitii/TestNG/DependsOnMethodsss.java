package Exercitii.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.fail;

public class DependsOnMethodsss {
    @Test(dependsOnMethods = {"test2,test3"}, alwaysRun = true)
    public void test() {
        System.out.println("test ");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");
        fail("failed test");
    }

    @Test
    public void test3() {
        System.out.println("test 3");
    }

    @Test @Ignore
    public void test4() {
        System.out.println("test 4");
    }
}
