package com.thewellness_project.component;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import com.thewellness_project.process.NutritionProgramGeneratorProcess;

public class TheWellnessProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {


		if(className.equalsIgnoreCase("com.thewellness_project.process.NutritionProgramGeneratorProcess"))
			return new NutritionProgramGeneratorProcess();
		
		return null;
	}

}
