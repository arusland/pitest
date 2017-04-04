package com.mycompany.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void testCalc() {
        App app = new App();

        assertEquals(4, app.calc(5, 3));
        assertEquals(15, app.calc(4, 9));
        //assertEquals(42, app.calc(1, 1));
    }
}
