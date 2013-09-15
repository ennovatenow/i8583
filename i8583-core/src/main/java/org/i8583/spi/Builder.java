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
package org.i8583.spi;

/**
 * Generic builder abstraction.
 * <p/>
 * Used for building composite objects which need assembly and validation across
 * the parts of the object.
 * <p/>
 * An ISO Message has a Message Type Indicator, a bitmap and a set of discreet
 * data elements. However a <strong>valid</strong> ISO Message is one where the
 * number of data elements is equal to the size of the bitmap and the presence
 * of an element is identified by switching on the corresponding bit in the
 * bitmap. We could have a builder implementation as follows,
 * <p/>
 * <code> 
 * Message m = new MessageBuilder().setMti("1210").setMaxElement(128).addElement(3,"994800.....").addElement(100,"1000009000").build(); 
 * </code>
 * 
 * @author ennovatenow
 * 
 */
public interface Builder<T> {

    /**
     * Builds a valid object. Throws a <code>BuilderException</code> if any
     * build validation fails.
     * 
     * @return
     */
    T build();
}
