package com.thewellness_project.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;

import org.compiere.util.EMail;
import org.compiere.util.Msg;
import org.compiere.util.Util;

public class MTWPProfile extends X_TWP_Profile{


	/**
	 * 
	 */
	private static final long serialVersionUID = 105906467346112552L;

	public MTWPProfile(Properties ctx, int TWP_Profile_ID, String trxName) {
		super(ctx, TWP_Profile_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTWPProfile(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (!Util.isEmpty(getEMail()) && (newRecord || is_ValueChanged(COLUMNNAME_EMail))) {
			if (! EMail.validate(getEMail())) {
				log.saveError("SaveError", Msg.getMsg(getCtx(), "InvalidEMailFormat") + Msg.getElement(getCtx(), COLUMNNAME_EMail) + " - [" + getEMail() + "]");
				return false;
			}
		}
		if (getdate_of_birth() != null && (newRecord || is_ValueChanged(COLUMNNAME_date_of_birth))) {
			Timestamp dob = getdate_of_birth();
			if (dob.after(new Date())) {
				log.saveError("SaveError", "Invalid date format. Date of birth can not be in the future " + Msg.getElement(getCtx(), COLUMNNAME_date_of_birth) + " - [" + getdate_of_birth() + "]");
				return false;
			}
		}
		return true;
	}	//	beforeSave
}
