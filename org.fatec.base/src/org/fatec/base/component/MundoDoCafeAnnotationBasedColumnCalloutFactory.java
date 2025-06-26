package org.fatec.base.component;

import org.adempiere.base.AnnotationBasedColumnCalloutFactory;
import org.adempiere.base.IColumnCalloutFactory;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author marcelino
 *
 */
@Component(immediate = true, service = IColumnCalloutFactory.class)
public class MundoDoCafeAnnotationBasedColumnCalloutFactory extends AnnotationBasedColumnCalloutFactory {

	@Override
	protected String[] getPackages() {
		return new String[] { "org.fatec.callout" };
	}

}
