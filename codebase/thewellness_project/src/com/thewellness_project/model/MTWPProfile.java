package com.thewellness_project.model;

import java.sql.ResultSet;
import java.util.Properties;

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

}
