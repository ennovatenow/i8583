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
 * Represents an ISO 8583 data element.
 * 
 * @author ennovatenow
 * 
 */
public interface ElementType {
    /**
     * Returns "Y" if this is a Fixed length data element. "N" otherwise.
     * 
     * @return "Y" if this is a Fixed length data element. "N" otherwise.
     */
    String getFixed();

    /**
     * Returns the maximum possible length of the data element.
     * 
     * @return The maximum possible length of the data element.
     */
    int getLength();

    /**
     * Returns the content type of the data element.
     * 
     * @return The content type of the data element.
     */
    String getType();
}
