package com.returnready.loopthereitis;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        NumberUtilitiesTest.class,
        TriangleUtilitiesTest.class,
        TableUtilitiesTest.class,
})
public class TestSuite {
}