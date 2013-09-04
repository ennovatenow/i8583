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

import org.i8583.spi.Registry;

/**
 * Default implementation of the <code>Registry</code>. This is a
 * <code>Map</code> based in-memory implementation.
 * 
 * @author ennovatenow
 * 
 */
public class DefaultRegistry extends HashMap<String, Object> implements
        Registry {

    private static final long serialVersionUID = -2210627069553146424L;

    @Override
    public Object lookup(String name) {
        return get(name);
    }

    @Override
    public <T> T lookup(String name, Class<T> type) {
        Object object = lookup(name);
        return type.cast(object);
    }

}
