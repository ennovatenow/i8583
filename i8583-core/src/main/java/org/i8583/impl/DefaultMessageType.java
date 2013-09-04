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

import org.i8583.ElementType;
import org.i8583.MessageType;

/**
 * Default implementation of <code>MessageType</code>.
 * <p/>
 * 
 * @author ennovatenow
 * 
 */
public class DefaultMessageType implements MessageType {

    private String mti;
    private ElementType bitmap;
    private Map<Integer, ElementType> elements = new HashMap<Integer, ElementType>();

    public DefaultMessageType(String mti) {
        this.mti = mti;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.MessageType#getBitmap()
     */
    @Override
    public ElementType getBitmap() {
        return bitmap;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.MessageType#getElement(int)
     */
    @Override
    public ElementType getElement(int position) {
        return elements.get(position);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.MessageType#getMti()
     */
    @Override
    public String getMti() {
        return mti;
    }

    /**
     * Set the bitmap definition of the message.
     * 
     * @param bitmap <code>ElementType</code> defining the Bitmap for the message.
     */
    public void setBitmap(ElementType bitmap) {
        this.bitmap = bitmap;
    }

    /**
     * Add <code>ElementType</code> to the <code>MessageType</code>.
     * 
     * @param position
     *            Position of the data element.
     * @param elementType
     *            <code>ElementType</code> to be added.
     */
    public void add(int position, ElementType elementType) {
        elements.put(position, elementType);
    }
}
