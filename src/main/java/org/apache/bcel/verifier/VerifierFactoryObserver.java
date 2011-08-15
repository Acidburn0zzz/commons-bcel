/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package org.apache.bcel.verifier;

/**
 * VerifierFactoryObserver instances are notified when new Verifier
 * instances are created.
 *
 * @version $Id$
 * @author Enver Haase
 *
 * @see VerifierFactory#getVerifier(String)
 * @see VerifierFactory#getVerifiers()
 * @see VerifierFactory#attach(VerifierFactoryObserver)
 * @see VerifierFactory#detach(VerifierFactoryObserver)
 */
public interface VerifierFactoryObserver {

    /**
     * VerifierFactoryObserver instances are notified invoking this method.
     * The String argument is the fully qualified class name of a class a
     * new Verifier instance created by the VerifierFactory operates on.
     */
    void update( String s );
}
