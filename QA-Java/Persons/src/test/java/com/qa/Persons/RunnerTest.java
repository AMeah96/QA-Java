package com.qa.Persons;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Runner
 */
public class RunnerTest
    extends TestCase
{
    /**
     * @param test case name
     */
    public RunnerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return test suite 
     */
    public static Test suite()
    {
        return new TestSuite( RunnerTest.class );
    }

    /**
     * Rigorous Test 
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
