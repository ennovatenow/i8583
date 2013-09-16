package org.i8583.impl.test;

import org.i8583.Message;
import org.i8583.impl.DefaultMessageBuilder;
import org.junit.Assert;
import org.junit.Test;

public class DefaultMessageBuilderTest {

    @Test
    public void simpleTest() {
        final DefaultMessageBuilder mb = new DefaultMessageBuilder("1200");
        mb.addElement(2, "10236598");

        final Message message = mb.build();

        Assert.assertTrue("mti is 1200", "1200".equals(message.getMti()));
        Assert.assertTrue("bitmap must be of size 128",
                128 == ((String) message.getElement("1")).length());
        Assert.assertTrue("mti is 1200",
                "10236598".equals(message.getElement("2")));

    }
}
