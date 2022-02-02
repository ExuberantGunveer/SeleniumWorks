package TestNgWorks;

import org.testng.annotations.*;

public class HelloTestNg {
    @BeforeSuite
    public void Launch_Browser()
    {
        System.out.println("Launch The Browser");
    }

    @BeforeTest
    public void beforeTest() {

        System.out.println("Before Test Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class Method");
    }

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("Before Method Concept");
    }

    @Test
    public void test() {
        System.out.println("My Test Method");
    }


    @AfterMethod
    public void aftermethod() {
        System.out.println("After Method Concept");
    }

    @AfterClass
    public void afterclass() {
        System.out.println("After Method Concept");
    }

    @AfterTest
    public void aftertest() {

        System.out.println("After Test Method");
    }
    @AfterSuite
    public void aftersuite() {

        System.out.println("After Suite Method");
    }
}
