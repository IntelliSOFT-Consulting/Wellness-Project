package com.thewellness_project.component;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import com.thewellness_project.model.MTWPProfile;

public class TheWellnessModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {
		
		//return custom models classes
		if(tableName.equals(MTWPProfile.Table_Name)){
			return MTWPProfile.class;
		}
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		
		//return custom models
		if(tableName.equals(MTWPProfile.Table_Name)){
			return new MTWPProfile(Env.getCtx(), Record_ID, trxName);
		}
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		
		//return custom models
		if(tableName.equals(MTWPProfile.Table_Name)){
			return new MTWPProfile(Env.getCtx(), rs, trxName);
		}
		return null;
	}

}
