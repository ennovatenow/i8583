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
package org.i8583;

/**
 * Represents the metadata about an ISO 8583 Message.
 * 
 * <p>
 * An ISO Message has three parts
 * <ul>
 * <li>Message type indicator (MTI)</li>
 * <li>One or more bitmaps - a field index to identify which fields are present.
 * </li>
 * <li>Data elements - fields that make up the message.</li>
 * </ul>
 * </p>
 * 
 * @author ennovatenow
 * 
 */
public interface MessageType {
    /**
     * Returns the <code>ElementType</code> of the Bitmap index.
     * 
     * @return The <code>ElementType</code> of the Bitmap index.
     */
    ElementType getBitmap();

    /**
     * Returns the <code>ElementType</code> of the data element in the Message
     * 
     * @param position
     *            Position of the element in the message.
     * @return The <code>ElementType</code> of the data element identified by
     *         the position.
     */
    ElementType getElement(String position);

    /**
     * Returns the Message Type Indicator of the Message
     * 
     * @return Message Type Indicator of the Message.
     */
    String getMti();
}
