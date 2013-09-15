/**
 * Copyright 2013 Evolvus Solutions Pvt. Ltd
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.i8583.impl;

import java.util.HashMap;
import java.util.Map;

import org.i8583.Message;
import org.i8583.spi.Builder;

/**
 * @author ennovatenow
 * 
 */
public class DefaultMessageBuilder implements Builder<Message> {

    private final String mti;
    private int maxElements;
    private final Map<Integer, String> elements;

    public DefaultMessageBuilder(String mti) {
        this.mti = mti;
        elements = new HashMap<Integer, String>();
    }

    public DefaultMessageBuilder setMaxElements(final int maxElements) {
        this.maxElements = maxElements;
        return this;
    }

    public DefaultMessageBuilder addElement(int position, String value) {
        elements.put(position, value);
        return this;
    }

    @Override
    public Message build() {
        StringBuilder bitmap = new StringBuilder(maxElements);
        
        for (int index = 0; index < maxElements; index++) {
            bitmap.setCharAt(index, '0');
        }
        
        for (Integer key : elements.keySet()) {
            bitmap.setCharAt(key, '1');
        }
        
        if(maxElements == 64) {
            bitmap.setCharAt(0, '0');
        }
        
        if(maxElements == 128) {
            bitmap.setCharAt(0, '1');
        }
        
        if(maxElements == 192) {
            bitmap.setCharAt(64, '1');
        }
                
        elements.put(1, bitmap.toString());

        return new Message() {

            public Object getMti() {
                return mti;
            }

            public Object getElement(String position) {
                return elements.get(Integer.parseInt(position));
            }

        };
    }

}
