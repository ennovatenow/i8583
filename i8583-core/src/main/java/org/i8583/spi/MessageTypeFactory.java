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

import org.i8583.MessageType;

/**
 * A factory for creating <code>MessageType</code> objects.
 * 
 * <p>
 * A <code>MessageType</code> is identified by its
 * "Message Type Indicator (MTI)" string.
 * </p>
 * 
 * @author ennovatenow
 * 
 */
public interface MessageTypeFactory {

    /**
     * Returns the <code>MessageType</code> for the message type indicator.
     * 
     * @param mti
     *            Message type indicator identifying the
     *            <code>MessageType</code>.
     * @return The <code>MessageType</code> instance.
     */
    MessageType getMessageType(String mti);
}
