package org.i8583.impl.test;

import static org.junit.Assert.assertTrue;

import org.i8583.Message;
import org.i8583.impl.DefaultMessageBuilder;
import org.junit.Test;

public class DefaultMessageBuilderTest {

    @Test
    public void simpleTest() {
        DefaultMessageBuilder mb = new DefaultMessageBuilder("1200");
        mb.addElement(2, "10236598");
        
        Message message = mb.build();
        
        assertTrue("mti is 1200", "1200".equals(message.getMti()));
        assertTrue("bitmap must be of size 128", 128 == ((String)message.getElement("1")).length());
        assertTrue("mti is 1200", "10236598".equals(message.getElement("2")));
        
    }
}
