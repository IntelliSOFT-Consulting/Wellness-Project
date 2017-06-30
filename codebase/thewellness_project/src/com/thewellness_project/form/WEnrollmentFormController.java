/**
 * 
 */
package com.thewellness_project.form;

import java.awt.GridLayout;

import org.adempiere.webui.component.Borderlayout;
import org.adempiere.webui.component.Checkbox;
import org.adempiere.webui.component.Datebox;
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
import org.zkoss.zhtml.Textarea;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Image;
import org.zkoss.zul.North;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;

public class WEnrollmentFormController implements IFormController, EventListener<Event> {
	
	private CustomForm form  = new CustomForm();
	
	public WEnrollmentFormController() {
		init();
	}
	
	String wellnessName = "wellness";
	String medicalConditionName = "medical_condition";
	String genderName = "gender";
	String whatsappName = "whatsapp";
	String otherConditionsName = "other_conditions";
	String otherOperationsName = "other_operations";
	String allergiesName = "allergies";
	String pregnantName = "pregnant";
	String breastFeedingName = "breast_feeding";
	String vegeterianName = "vegeterian";
	
	private Borderlayout mainLayout = new Borderlayout();
	private Panel profilePanel = new Panel();
	private Grid headerLayout = GridFactory.newGridLayout();
	private Grid titleLayout = GridFactory.newGridLayout();
	private Grid profileLayout = GridFactory.newGridLayout();
	private Grid bioDataLayout = GridFactory.newGridLayout();
	Image logo =  new Image();
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
	private Textarea deliveryAddressField = new Textarea();
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
	private Label medicalHistoryLabel = new Label();
	private Checkbox highBPCheckbox = new Checkbox();
	private Checkbox heartConditionCheckbox = new Checkbox();
	private Checkbox kidneyCheckbox = new Checkbox();
	private Checkbox highCholesterolCheckbox = new Checkbox();
	private Checkbox depressionCheckbox = new Checkbox();
	private Checkbox hypothyroidismCheckbox = new Checkbox();
	private Checkbox gallBladderCheckbox = new Checkbox();
	private Checkbox diabetesCheckbox = new Checkbox();
	private Checkbox hyperthyroidismCheckbox = new Checkbox();
	private Checkbox hysterectomyCheckbox = new Checkbox();
	private Checkbox liverCheckbox = new Checkbox();
	private Label otherConditionLabel = new Label();
	private Radiogroup otherConditions = new Radiogroup();
	private Label otherConditionNoteLabel = new Label();
	private Textbox otherConditionNoteField = new Textbox();
	private Label otherOperationLabel = new Label();
	private Radiogroup otherOperations = new Radiogroup();
	private Label otherOperationNoteLabel = new Label();
	private Textbox otherOperationNoteField = new Textbox();
	private Label allergiesLabel = new Label();
	private Radiogroup allergies = new Radiogroup();
	private Label allergiesNoteLabel = new Label();
	private Textbox allergiesNoteField = new Textbox();
	private Label medicationLabel = new Label();
	private Textbox medicationField = new Textbox();
	private Label pleaseSpecifyStateLabel = new Label();
	private Label pregnantLabel = new Label();
	private Radiogroup pregnant = new Radiogroup();
	private Label breastFeedingLabel = new Label();
	private Radiogroup breastFeeding = new Radiogroup();
	private Label vegeterianLabel = new Label();
	private Radiogroup vegeterian = new Radiogroup();
	private Label foodsCanEatLabel = new Label("IF VEGETARIAN PLEASE INDICATE IF YOU EAT ANY OF THE FOLLOWING FOODS.");
	private Checkbox fishCheckbox = new Checkbox();
	private Checkbox chickenCheckbox = new Checkbox();
	private Checkbox cheeseCheckbox = new Checkbox();
	private Checkbox eggsCheckbox = new Checkbox();
	private Checkbox yoghurtCheckbox = new Checkbox();
	private Checkbox tofuCheckbox = new Checkbox();
	private Checkbox soyaCheckbox = new Checkbox();
	
	

	private void init() {
		form.appendChild(mainLayout);
		
		profilePanel.appendChild(headerLayout);
		profilePanel.appendChild(titleLayout);
		profilePanel.appendChild(profileLayout);
		profilePanel.appendChild(bioDataLayout);
		
		logo.setSrc("http://thewellness-project.com/wp-content/uploads/2017/05/top.jpg");//TODO add image images/wellness_logo.png		
		enrollmentFormTitleLabel.setText("ENROLMENT FORM");
		myWellnessLabel.setText("My Wellness:");		
		walkCheckbox.setText("Walk");	
		walkCheckbox.setName(wellnessName);
		marathonCheckbox.setText("Marathon");	
		marathonCheckbox.setName(wellnessName);
		runCheckbox.setText("Run");	
		runCheckbox.setName(wellnessName);
		sprintCheckbox.setText("Sprint");	
		sprintCheckbox.setName(wellnessName);
		strollCheckbox.setText("Stroll");	
		strollCheckbox.setName(wellnessName);
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
		medicalHistoryLabel.setText("MEDICAL HISTORY (SELECT APPLICABLE CONDITION)");
		highBPCheckbox.setText("High Blood Pressure");	
		highBPCheckbox.setName(medicalConditionName);
		heartConditionCheckbox.setText("Heart Condition");	
		heartConditionCheckbox.setName(medicalConditionName);
		kidneyCheckbox.setText("Kidney");	
		kidneyCheckbox.setName(medicalConditionName);
		highCholesterolCheckbox.setText("High Cholesterol");	
		highCholesterolCheckbox.setName(medicalConditionName);
		depressionCheckbox.setText("Depression");	
		depressionCheckbox.setName(medicalConditionName);
		hypothyroidismCheckbox.setText("Hypothyroidism");	
		hypothyroidismCheckbox.setName(medicalConditionName);
		gallBladderCheckbox.setText("Gall Bladder");	
		gallBladderCheckbox.setName(medicalConditionName);
		diabetesCheckbox.setText("Diabetes");	
		diabetesCheckbox.setName(medicalConditionName);
		hyperthyroidismCheckbox.setText("Hyperthyroidism");	
		hyperthyroidismCheckbox.setName(medicalConditionName);
		hysterectomyCheckbox.setText("Hysterectomy");	
		hysterectomyCheckbox.setName(medicalConditionName);
		liverCheckbox.setText("Liver");	
		liverCheckbox.setName(medicalConditionName);
		otherConditionLabel.setText("Other Conditions");
		otherConditionNoteLabel.setText("Please explain");
		otherOperationLabel.setText("Other Operations");
		otherOperationNoteLabel.setText("Please explain");
		allergiesLabel.setText("Allergies");
		allergiesNoteLabel.setText("Please explain");
		medicationLabel.setText("Medication");
		pleaseSpecifyStateLabel.setText("PLEASE SPECIFY IF YOU ARE:");
		fishCheckbox.setText("Fish");
		chickenCheckbox.setText("Chicken");
		cheeseCheckbox.setText("Cheese");
		eggsCheckbox.setText("Eggs");
		yoghurtCheckbox.setText("Yoghurt");
		tofuCheckbox.setText("Tofu");
		soyaCheckbox.setText("Soya");
		
		North north = new North();
		north.setStyle("border: none; background-color: #F9F9F9;");
		mainLayout.appendChild(north);
		north.appendChild(profilePanel);	
		
		initHeader();
		
		initTitle();
		
			
		initProfileFields();
		
	}

	private void initHeader() {		
		
		Rows rows = null;
		Row row = null;
		
		ZKUpdateUtil.setWidth(headerLayout, "80%");
		rows = headerLayout.newRows();
		row = rows.newRow();
		row.appendChild(logo);
		
		//add the company address
		Grid address = GridFactory.newGridLayout();
		Rows addresses = address.newRows();
		Row addressLine = null;
		
		addressLine = addresses.newRow();
		addressLine.appendCellChild(new Label(""));
		
		
	}
	
	private void initTitle() {
		Rows rows = null;
		Row row = null;
		
		ZKUpdateUtil.setWidth(titleLayout, "80%");
		rows = titleLayout.newRows();
		row = rows.newRow();
		Center center = new Center();
		enrollmentFormTitleLabel.setStyle("font-size:22px");
		center.appendChild(enrollmentFormTitleLabel);
		row.appendCellChild(center);
	}

	private void initProfileFields(){
		
		Rows rows = null;
		Row row = null;
		
		ZKUpdateUtil.setWidth(profileLayout, "80%");
		rows = profileLayout.newRows();

		row = rows.newRow();
		row.appendCellChild(myWellnessLabel,1);
		row.appendCellChild(walkCheckbox,1);
		row.appendCellChild(marathonCheckbox,1);
		row.appendCellChild(runCheckbox,1);
		row.appendCellChild(sprintCheckbox,1);
		row.appendCellChild(strollCheckbox,1);
		
		row = rows.newRow();
		row.appendCellChild(firstNameLabel,1);
		row.appendCellChild(firstNameField,2);
		row.appendCellChild(middleNameLabel,1);
		row.appendCellChild(middleNameField,2);
		
		row = rows.newRow();
		row.appendCellChild(lastNameLabel,1);
		row.appendCellChild(lastNameField,2);
		row.appendCellChild(dOBLabel,1);
		row.appendCellChild(dOBField,2);
		
		row = rows.newRow();
		row.appendCellChild(postalAddressLabel,1);
		row.appendCellChild(postalAddressField,2);
		row.appendCellChild(iDLabel,1);
		row.appendCellChild(iDField,2);
		
		row = rows.newRow();
		row.appendCellChild(townLabel,1);
		row.appendCellChild(townField,2);
		row.appendCellChild(mobileNoLabel,1);
		row.appendCellChild(mobileNoField,2);
		
		row = rows.newRow();
		row.appendCellChild(deliveryAddressLabel,1);
		row.appendCellChild(deliveryAddressField,2);
		row.appendCellChild(otherNoLabel,1);
		row.appendCellChild(otherNoField,2);
		
		row = rows.newRow();
		Radio female = gender.appendItem("Female", "female");
		female.setName(genderName);
		Radio male = gender.appendItem("Male", "male");
		male.setName(genderName);
		row.appendCellChild(genderLabel,1);
		row.appendCellChild(gender,2);
		
		row = rows.newRow();
		row.appendCellChild(emailLabel,1);
		row.appendCellChild(emailField,5);
		
		row = rows.newRow();
		row.appendCellChild(heightLabel,1);
		row.appendCellChild(heightField,1);
		row.appendCellChild(weightLabel);
		row.appendCellChild(weightField);
		row.appendCellChild(goalWeightLabel);
		row.appendCellChild(goalWeightField);
		row.appendCellChild(bpLabel);
		row.appendCellChild(bpField);
		
		row = rows.newRow();
		row.appendChild(whatsAppLabel);
		Radio whatsAppYes = whatsApp.appendItem("Y", "y");
		whatsAppYes.setName(whatsappName);
		Radio whatsAppNo = whatsApp.appendItem("N", "n");
		whatsAppNo.setName(whatsappName);
		row.appendChild(whatsApp);
		
		row = rows.newRow();
		Center medicalHistoryCenter = new Center();
		medicalHistoryCenter.appendChild(medicalHistoryLabel);
		row.appendCellChild(medicalHistoryCenter);
		
		row = rows.newRow();
		row.appendCellChild(highBPCheckbox,1);
		row.appendCellChild(heartConditionCheckbox,1);
		row.appendCellChild(kidneyCheckbox,1);
		row = rows.newRow();
		row.appendCellChild(highCholesterolCheckbox,1);
		row.appendCellChild(depressionCheckbox,1);
		row.appendCellChild(hypothyroidismCheckbox,1);
		row = rows.newRow();
		row.appendCellChild(gallBladderCheckbox,1);
		row.appendCellChild(diabetesCheckbox,1);
		row.appendCellChild(hyperthyroidismCheckbox,1);
		row = rows.newRow();
		row.appendCellChild(hysterectomyCheckbox,1);
		row.appendCellChild(liverCheckbox,1);
		
		row = rows.newRow();
		Radio yesOtherCondition = otherConditions.appendItem("Yes", "y");
		yesOtherCondition.setName(otherConditionsName);
		Radio noOtherCondition = otherConditions.appendItem("No", "n");
		noOtherCondition.setName(otherConditionsName);
		row.appendChild(otherConditionLabel);
		row.appendChild(otherConditions);
		row.appendChild(otherConditionNoteLabel);
		row.appendChild(otherConditionNoteField);
		
		row = rows.newRow();
		Radio yesOtherOperation = otherOperations.appendItem("Yes", "y");
		yesOtherOperation.setName(otherOperationsName);
		Radio noOtherOperation = otherOperations.appendItem("No", "n");
		noOtherOperation.setName(otherOperationsName);
		row.appendChild(otherOperationLabel);
		row.appendChild(otherOperations);
		row.appendChild(otherOperationNoteLabel);
		row.appendChild(otherOperationNoteField);
		
		row = rows.newRow();
		Radio yesAllergies = allergies.appendItem("Yes", "y");
		yesAllergies.setName(allergiesName);
		Radio noAllergies = allergies.appendItem("No", "n");
		noAllergies.setName(allergiesName);
		row.appendChild(allergiesLabel);
		row.appendChild(allergies);
		row.appendChild(allergiesNoteLabel);
		row.appendChild(allergiesNoteField);

		row = rows.newRow();
		row.appendChild(medicationLabel);
		row.appendChild(medicationField);
				
		row = rows.newRow();
		row.appendChild(pleaseSpecifyStateLabel);
		Radio yesPregnant = pregnant.appendItem("Yes", "y");
		yesPregnant.setName(pregnantName);
		Radio noPregnant = pregnant.appendItem("No", "n");
		noPregnant.setName(pregnantName);
		row.appendChild(pregnantLabel);
		row.appendChild(pregnant);
		Radio yesBreastFeeding = breastFeeding.appendItem("Yes", "y");
		yesBreastFeeding.setName(breastFeedingName);
		Radio noBreastFeeding = breastFeeding.appendItem("No", "n");
		noBreastFeeding.setName(breastFeedingName);
		row.appendChild(breastFeedingLabel);
		row.appendChild(breastFeeding);
		Radio yesVegeterian = vegeterian.appendItem("Yes", "y");
		yesVegeterian.setName(vegeterianName);
		Radio noVegeterian = vegeterian.appendItem("No", "n");
		noVegeterian.setName(vegeterianName);
		row.appendChild(vegeterianLabel);
		row.appendChild(vegeterian);
		
		row = rows.newRow();
		row.appendChild(foodsCanEatLabel);
		row = rows.newRow();
		row.appendCellChild(fishCheckbox,1);
		row.appendCellChild(chickenCheckbox,1);
		row.appendCellChild(cheeseCheckbox,1);
		row.appendCellChild(eggsCheckbox,1);
		row.appendCellChild(yoghurtCheckbox,1);
		row.appendCellChild(tofuCheckbox,1);
		row.appendCellChild(soyaCheckbox,1);
		
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
