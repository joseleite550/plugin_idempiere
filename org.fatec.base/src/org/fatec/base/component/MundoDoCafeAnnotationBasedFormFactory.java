package org.fatec.base.component;

import org.adempiere.webui.factory.AnnotationBasedFormFactory;
import org.adempiere.webui.factory.IFormFactory;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author marcelino
 *
 */
@Component(immediate = true, service = IFormFactory.class, property = { "service.ranking:Integer=1" })
public class MundoDoCafeAnnotationBasedFormFactory extends AnnotationBasedFormFactory {

	@Override
	protected String[] getPackages() {
		return new String[] { "org.fatec.form" };
	}

}
