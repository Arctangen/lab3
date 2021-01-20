package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public AppTest()  {

        CrossRoads CR = new CrossRoads();

    }


    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
