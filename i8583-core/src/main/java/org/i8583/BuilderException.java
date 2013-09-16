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
 * Thrown when there is any validating failure during the build process.
 * <p/>
 * Such a failure could be because of invalid data or value out of range.
 * 
 * @author ennovatenow
 * 
 */
public class BuilderException extends RuntimeException {

    private static final long serialVersionUID = 6806634881819310662L;

    /**
     * Constructs a new exception with the specified detail message. The cause
     * is not initialised, and may subsequently be initialised by a call to
     * java.lang.Throwable.initCause(java.lang.Throwable).
     * 
     * @param message
     */
    public BuilderException(final String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * <p/>
     * Note that the detail message associated with cause is not automatically
     * incorporated into this exception's detail message.
     * 
     * @param message
     *            The detail message which is saved for later retrieval by the
     *            java.lang.Throwable.getMessage() method.
     * @param cause
     *            The cause which is saved for later retrieval by the
     *            java.lang.Throwable.getCause() method. A null value is
     *            permitted, and indicates that the cause is nonexistent or
     *            unknown.
     */
    public BuilderException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new exception with the specified cause and a detail message
     * of (cause==null ? null : cause.toString()) (which typically contains the
     * class and detail message of cause). This constructor is useful for
     * exceptions that are little more than wrappers for other throwables.
     * 
     * @param cause
     *            The cause which is saved for later retrieval by the
     *            java.lang.Throwable.getCause() method. A null value is
     *            permitted, and indicates that the cause is nonexistent or
     *            unknown.
     */
    public BuilderException(final Throwable cause) {
        super(cause);
    }

}
