/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.jupiter.engine.discovery;

import java.util.List;
import java.util.function.Predicate;

import org.junit.platform.engine.EngineDiscoveryRequest;

/**
 * Discovery extension point.
 *
 * @since 5.1
 */
public interface Discoverer {

	/**
	 * Return list of classes that contains testable members.
	 *
	 * @param request originating discovery request instance
	 * @param classNameFilter filter to apply to the fully qualified class name
	 * @param classTester filter to apply to each class instance
	 * @return list of classes
	 */
	List<Class<?>> discover(EngineDiscoveryRequest request, Predicate<String> classNameFilter,
			Predicate<Class<?>> classTester);

}
