package org.fatec.base.component;

import org.adempiere.base.AnnotationBasedEventManager;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author marcelino
 *
 */
@Component(immediate = true, service = {})
public class MundoDoCafeAnnotationBasedEventManager extends AnnotationBasedEventManager {

	@Override
	public String[] getPackages() {
		return new String[] { "org.fatec.event" };
	}

}
