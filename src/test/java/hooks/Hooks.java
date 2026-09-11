package hooks;

import base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private BaseTest baseTest = new BaseTest();

    @Before
    public void setUp() {
        System.out.println("Starting browser...");
    }

    @After
    public void tearDown() {

        System.out.println("Closing browser...");

        baseTest.closeBrowser();
    }
}