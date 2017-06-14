/**
 * 
 */
package com.thewellness_project.form;

import org.adempiere.webui.component.Borderlayout;
import org.adempiere.webui.component.Checkbox;
import org.adempiere.webui.component.Datebox;
import org.adempiere.webui.component.EditorBox;
import org.adempiere.webui.component.Grid;
import org.adempiere.webui.component.GridFactory;
import org.adempiere.webui.component.Label;
import org.adempiere.webui.component.Panel;
import org.adempiere.webui.component.Row;
import org.adempiere.webui.component.Rows;
import org.adempiere.webui.component.Textbox;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.panel.CustomForm;
import org.adempiere.webui.panel.IFormController;
import org.adempiere.webui.util.ZKUpdateUtil;
import org.zkoss.zhtml.Center;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.North;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;

public class WEnrollmentFormController implements IFormController, EventListener<Event> {
	
	private CustomForm form  = new CustomForm();
	
	public WEnrollmentFormController() {
		init();
	}
	
	private Borderlayout mainLayout = new Borderlayout();
	private Panel profilePanel = new Panel();
	private Panel bioDataPanel = new Panel();
	private Grid profileLayout = GridFactory.newGridLayout();
	private Grid bioDataLayout = GridFactory.newGridLayout();
	private Label enrollmentFormTitleLabel = new Label();
	private Label myWellnessLabel = new Label();
	private Checkbox walkCheckbox = new Checkbox();
	private Checkbox marathonCheckbox = new Checkbox();
	private Checkbox runCheckbox = new Checkbox();
	private Checkbox sprintCheckbox = new Checkbox();
	private Checkbox strollCheckbox = new Checkbox();
	private Label firstNameLabel = new Label();
	private Textbox firstNameField = new Textbox();
	private Label middleNameLabel = new Label();
	private Textbox middleNameField = new Textbox();
	private Label lastNameLabel = new Label();
	private Textbox lastNameField = new Textbox();
	private Label dOBLabel = new Label();
	private Datebox dOBField = new Datebox();
	private Label postalAddressLabel = new Label();
	private Textbox postalAddressField = new Textbox();
	private Label iDLabel = new Label();
	private Textbox iDField = new Textbox();
	private Label townLabel = new Label();
	private Textbox townField = new Textbox();
	private Label mobileNoLabel = new Label();
	private Textbox mobileNoField = new Textbox();
	private Label deliveryAddressLabel = new Label();
	private Textbox deliveryAddressField = new Textbox();//TODO add to have 3 rows
	private Label otherNoLabel = new Label();
	private Textbox otherNoField = new Textbox();
	private Label genderLabel = new Label();
	private Radiogroup gender = new Radiogroup();
	private Label emailLabel = new Label();
	private Textbox emailField = new Textbox();
	private Label heightLabel = new Label();
	private Textbox heightField = new Textbox();
	private Label weightLabel = new Label();
	private Textbox weightField = new Textbox();
	private Label goalWeightLabel = new Label();
	private Textbox goalWeightField = new Textbox();
	private Label bpLabel = new Label();
	private Textbox bpField = new Textbox();
	private Label whatsAppLabel = new Label();
	private Radiogroup whatsApp = new Radiogroup();
	
	

	private void init() {
		form.appendChild(mainLayout);
		
		profilePanel.appendChild(profileLayout);
		bioDataPanel.appendChild(bioDataLayout);
		
		enrollmentFormTitleLabel.setText("ENROLMENT FORM");
		myWellnessLabel.setText("My Wellness:");
		walkCheckbox.setText("Walk");
		marathonCheckbox.setText("Marathon");
		runCheckbox.setText("Run");
		sprintCheckbox.setText("Sprint");
		strollCheckbox.setText("Stroll");
		firstNameLabel.setText("First Name:");
		middleNameLabel.setText("Middle Name:");
		lastNameLabel.setText("Last Name:");
		dOBLabel.setText("Date of Birth:");
		postalAddressLabel.setText("Postal Address:");
		iDLabel.setText("ID/PP Number:");
		townLabel.setText("Town/City:");
		mobileNoLabel.setText("Mobile Number:");
		deliveryAddressLabel.setText("Delivery Address:");
		otherNoLabel.setText("Other Number:");
		genderLabel.setText("Gender:");
		emailLabel.setText("Email Address:");
		heightLabel.setText("Height:");
		weightLabel.setText("Weight :");
		goalWeightLabel.setText("Goal Weight :");
		bpLabel.setText("B.P:");
		whatsAppLabel.setText("Would you like to be added to be a part of a Wellness project Whatsapp group?");
		
		North north = new North();
		north.setStyle("border: none");
		mainLayout.appendChild(north);
		north.appendChild(profilePanel);
		
		Rows rows = null;
		Row row = null;
		
		ZKUpdateUtil.setWidth(profileLayout, "80%");
		rows = profileLayout.newRows();
		row = rows.newRow();
		Center center = new Center();
		center.appendChild(enrollmentFormTitleLabel);
		row.appendCellChild(center);

		row = rows.newRow();
		row.appendCellChild(myWellnessLabel.rightAlign(),1);
		row.appendCellChild(walkCheckbox,1);
		row.appendCellChild(marathonCheckbox,1);
		row.appendCellChild(runCheckbox,1);
		row.appendCellChild(sprintCheckbox,1);
		row.appendCellChild(strollCheckbox,1);
		
		row = rows.newRow();
		row.appendChild(firstNameLabel.rightAlign());
		row.appendChild(firstNameField);
		row.appendChild(middleNameLabel.rightAlign());
		row.appendChild(middleNameField);
		
		row = rows.newRow();
		row.appendChild(lastNameLabel.rightAlign());
		row.appendChild(lastNameField);
		row.appendChild(dOBLabel.rightAlign());
		row.appendChild(dOBField);
		
		row = rows.newRow();
		row.appendChild(postalAddressLabel.rightAlign());
		row.appendChild(postalAddressField);
		row.appendChild(iDLabel.rightAlign());
		row.appendChild(iDField);
		
		row = rows.newRow();
		row.appendChild(townLabel.rightAlign());
		row.appendChild(townField);
		row.appendChild(mobileNoLabel.rightAlign());
		row.appendChild(mobileNoField);
		
		row = rows.newRow();
		row.appendChild(deliveryAddressLabel.rightAlign());
		row.appendChild(deliveryAddressField);
		row.appendChild(otherNoLabel.rightAlign());
		row.appendChild(otherNoField);
		row.appendChild(otherNoLabel.rightAlign());
		row.appendChild(otherNoField);
		Radio female = gender.appendItem("Female", "");
		Radio male = gender.appendItem("Male", "");
		row.appendChild(genderLabel.rightAlign());
		row.appendChild(female);
		row.appendChild(male);
		
		row = rows.newRow();
		row.appendChild(emailLabel.rightAlign());
		row.appendChild(emailField);
		
		row = rows.newRow();
		row.appendChild(heightLabel.rightAlign());
		row.appendChild(heightField);
		row.appendChild(weightLabel.rightAlign());
		row.appendChild(weightField);
		row.appendChild(goalWeightLabel.rightAlign());
		row.appendChild(goalWeightField);
		row.appendChild(bpLabel.rightAlign());
		row.appendChild(bpField);
		
		row = rows.newRow();
		row.appendChild(whatsAppLabel.rightAlign());
		Radio whatsAppYes = whatsApp.appendItem("Y", "");
		Radio whatsAppNo = whatsApp.appendItem("N", "");
		row.appendChild(whatsAppYes);
		row.appendChild(whatsAppNo);
	}

	@Override
	public ADForm getForm() {
		return form;
	}

	@Override
	public void onEvent(Event event) throws Exception {
		
		
	}
	
	private void setMyWellness(){
		
	}

}
