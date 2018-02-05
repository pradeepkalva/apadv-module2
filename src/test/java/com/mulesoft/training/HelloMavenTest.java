package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("apadv-model1Flow", "Hello World");
    }
    
    @Override
    protected String getConfigFile() {
        return "apadv-model1.xml";
    }

}
