/*******************************************************************************
 * Copyright (c) 1998, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Denise Smith  June 05, 2009 - Initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.listofobjects;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class JAXBListOfObjectsSuite extends TestCase {
	public JAXBListOfObjectsSuite(String name) {
		super(name);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.main(new String[] { "-c",
						"org.eclipse.persistence.testing.jaxb.listofobjects.JAXBListOfObjectsSuite" });
	}

	public static Test suite() {
		TestSuite suite = new TestSuite("JAXBListOfObjectsSuite Test Suite");
		suite.addTestSuite(JAXBEmployeeArrayTestCases.class);
		suite.addTestSuite(JAXBEmployeeListTestCases.class);
		suite.addTestSuite(JAXBIntegerArrayTestCases.class);
		suite.addTestSuite(JAXBIntegerListTestCases.class);
		suite.addTestSuite(JAXBIntArrayTestCases.class);
		suite.addTestSuite(JAXBCharArrayTestCases.class);
		suite.addTestSuite(JAXBBooleanArrayTestCases.class);
		suite.addTestSuite(JAXBListNameCollisionEmployeeTestCases.class);
		suite.addTestSuite(JAXBListNameCollisionEmployee2TestCases.class);
		suite.addTestSuite(JAXBEmployeesAndIntegersTestCases.class);
		suite.addTestSuite(JAXBStringIntegerHashMapTestCases.class);
		suite.addTestSuite(JAXBStringEmployeeMapTestCases.class);
		suite.addTestSuite(JAXBListOfObjectsNonRootTestCases.class);
		suite.addTestSuite(JAXBObjectCollectionsTestCases.class);
		return suite;
	}
}
