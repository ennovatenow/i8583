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
 * 
 * @author ennovatenow
 * 
 */
public class DefaultMessageBuilder implements Builder<Message> {

    private final String mti;
    private final Map<Integer, String> elements;

    public DefaultMessageBuilder(final String mti) {
        this.mti = mti;
        elements = new HashMap<Integer, String>();
    }

    public DefaultMessageBuilder addElement(final int position,
            final String value) {
        elements.put(position, value);
        return this;
    }

    @Override
    public Message build() {
        final int maxElements = 128;

        final StringBuilder bitmap = new StringBuilder(maxElements);

        for (int index = 0; index < maxElements; index++) {
            bitmap.append('0');
        }

        for (final Integer key : elements.keySet()) {
            bitmap.setCharAt(key - 1, '1');
        }

        bitmap.setCharAt(0, '1');
        elements.put(1, bitmap.toString());

        return new Message() {

            @Override
            public Object getElement(final String index) {
                return elements.get(Integer.parseInt(index));
            }

            @Override
            public Object getMti() {
                return mti;
            }

            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(String.format("mti: %s%n", getMti()));
                sb.append('\n');
                for (int i = 1; i <= 128; i++) {
                    sb.append(String.format("element(%d): %s%n ", i,
                            elements.get(i)));
                }
                return sb.toString();
            }

        };
    }

}
