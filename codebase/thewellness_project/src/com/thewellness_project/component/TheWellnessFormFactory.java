package com.thewellness_project.component;

import java.util.logging.Level;

import org.adempiere.webui.factory.IFormFactory;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.panel.IFormController;
import org.compiere.util.CLogger;

/**
 * This class is meant to be used as the default Form loader of the plug-in 
 * 
 * It will be called from OSGI service when there is a request to create a Form from client
 * 
 */
public class TheWellnessFormFactory implements IFormFactory{
	
	protected transient CLogger log  = CLogger.getCLogger(getClass());

	@Override
	public ADForm newFormInstance(String formName) {
		if(formName.startsWith("com.thewellness_project.form")){
			//return the requested form
			
			Object form = null;
			Class<?> clazz = null;
			ClassLoader loader = getClass().getClassLoader();
			
			try {
				clazz = loader.loadClass(formName);
			} catch (Exception e) {
				log.log(Level.FINE, "Unable to load Form class", e);
			}
			
			if(clazz != null){
				
				try {
					form = clazz.newInstance();
				} catch (Exception e) {
					log.log(Level.FINE, "Unable to instantiate Form class", e);
				}
			}
			
			if(form != null){
				if(form instanceof ADForm){
					return (ADForm) form;
				} else if(form instanceof IFormController){
					IFormController controller = (IFormController) form;
					ADForm adForm = controller.getForm();
					adForm.setICustomForm(controller);
					return adForm;
				}
			}
		}
		return null;
	}

}
