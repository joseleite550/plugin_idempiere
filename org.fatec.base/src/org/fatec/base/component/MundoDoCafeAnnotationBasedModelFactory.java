package org.fatec.base.component;

import org.adempiere.base.AnnotationBasedModelFactory;
import org.adempiere.base.IModelFactory;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author marcelino
 *
 */
@Component(immediate = true, service = IModelFactory.class, property = "service.ranking:Integer=1")
public class MundoDoCafeAnnotationBasedModelFactory extends AnnotationBasedModelFactory {

	@Override
	public String[] getPackages() {
		return new String[] { "org.fatec.model" };
	}

}
