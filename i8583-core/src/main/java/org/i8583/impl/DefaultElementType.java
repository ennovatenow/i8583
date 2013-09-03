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

import org.i8583.ElementType;

/**
 * Default Implementation of <code>ElementType</code>.
 * 
 * <p/>
 * The default implementation of <code>ElementType</code> throws an
 * <code>IllegalArgumentException</code> if the maximum field length is zero or
 * if the content type or fixed flag indicator is null or invalid.
 * <p/>
 * To avoid <code>IllegalArgumentException</code>, ensure that the maximum field
 * length is greater than 0 and use the constants for type and fixed length
 * indicator which are provided for convenience.
 * <p/>
 * e.g.
 * 
 * <pre>
 * DefaultElementType fieldTwo = new DefaultElementType(
 *         DefaultElementType.NUMERIC, 19, DefaultElementType.VARIABLE);
 * </pre>
 * 
 * @author ennovatenow
 * 
 */
public class DefaultElementType implements ElementType {

    /**
     * Indicates the data element is Fixed length.
     */
    public static final String FIXED = "Y";

    /**
     * Indicates the data element is variable length.
     */
    public static final String VARIABLE = "N";

    /**
     * Indicates that the content of the data element is alphabetic only.
     */
    public static final String ALPHABETIC = "A";

    /**
     * Indicates that the content of the data element is numeric only.
     */
    public static final String NUMERIC = "N";

    /**
     * Indicates that the content of the data element has only special
     * characters.
     */
    public static final String SPECIAL = "S";

    /**
     * Indicates that the content of the data element is alphanumeric only.
     */
    public static final String ALPHANUMERIC = "AN";

    /**
     * Indicates that the content of the data element can only be alphabetic and
     * special characters.
     */
    public static final String ALPHASPECIAL = "AS";

    /**
     * Indicates that the content of the data element can only be numeric and
     * special characters.
     */
    public static final String NUMERSPECIAL = "NS";

    /**
     * Indicates that the content of the data element can be alphabetic, numeric
     * or special characters.
     */
    public static final String ALPHANUMERSPECIAL = "ANS";

    /**
     * Indicates that the content of the data element is binary.
     */
    public static final String BINARY = "B";

    /**
     * Indicates that the content of the data element is Tracks 2 and 3 code set
     * as defined in ISO/IEC 7813 and ISO/IEC 4909 respectively
     */
    public static final String TRACKCODE = "Z";

    /**
     * Fixed length indicator.
     */
    private final String fixed;

    /**
     * Maximum possible length of the data element.
     */
    private final int length;

    /**
     * Content type of the data element.
     */
    private final String type;

    /**
     * Constructs the <code>ElementType</code> with the specified content type,
     * maximum length and fixed length indicator.
     * <p/>
     * Throws <code>IllegalArgumentException</code> if the parameters are
     * invalid.
     * 
     * @param type
     *            Content type of the data element.
     * @param length
     *            Maximum length of the data element
     * @param fixed
     *            Fixed length indicator.
     */
    public DefaultElementType(final String type, final int length,
            final String fixed) {
        if (length <= 0 || type == null || fixed == null) {
            throw new IllegalArgumentException(
                    String.format(
                            "Invalid Arguments to the constructor type=%s, length=%d, fixed=%s ",
                            type, length, fixed));
        }
        this.type = type;
        this.length = length;
        this.fixed = fixed;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.ElementType#getFixed()
     */
    @Override
    public String getFixed() {
        return fixed;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.ElementType#getLength()
     */
    @Override
    public int getLength() {
        return length;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.i8583.ElementType#getType()
     */
    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format(
                "DefaultElementType[type=%s, length=%d, fixed=%s]", type,
                length, fixed);
    }

}
