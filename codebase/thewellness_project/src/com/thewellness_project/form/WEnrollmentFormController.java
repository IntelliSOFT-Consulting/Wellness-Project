/**
 * 
 */
package com.thewellness_project.form;

import org.adempiere.webui.component.Borderlayout;
import org.adempiere.webui.component.Textbox;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.panel.CustomForm;
import org.adempiere.webui.panel.IFormController;
import org.zkoss.zhtml.Center;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.North;

public class WEnrollmentFormController implements IFormController, EventListener<Event> {
	
	private CustomForm customForm  = new CustomForm();
	//private Checkbox myWellnessCheckbox = new Checkbox();
	private Textbox txtTitle = new Textbox("ENROLMENT FORM");
	
	public WEnrollmentFormController() {
		init();
	}

	private void init() {
		Borderlayout borderlayout = new Borderlayout();
		customForm.setStyle("width:100%; height:100%; position:absolute"); 
		borderlayout.setStyle("width:100%; height:100%; position:absolute");
		
		North north = new North();		
		north.appendChild(txtTitle);
		
		//add check box
		//myWellnessCheckbox.
		
		
		Center center =  new Center();
		borderlayout.appendChild(north);
		
		customForm.appendChild(borderlayout);
		
		txtTitle.addEventListener(Events.ON_OK, this);
		
		
	}

	@Override
	public ADForm getForm() {
		return customForm;
	}

	@Override
	public void onEvent(Event event) throws Exception {
		if(event.getTarget().equals(txtTitle) && txtTitle.getValue().trim().length()>0){
			txtTitle.setValue(txtTitle.getValue().toLowerCase());
		}
		
	}

}
