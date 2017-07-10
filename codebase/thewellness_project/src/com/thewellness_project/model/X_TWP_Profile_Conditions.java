/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.thewellness_project.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for TWP_Profile_Conditions
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_TWP_Profile_Conditions extends PO implements I_TWP_Profile_Conditions, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170710L;

    /** Standard Constructor */
    public X_TWP_Profile_Conditions (Properties ctx, int TWP_Profile_Conditions_ID, String trxName)
    {
      super (ctx, TWP_Profile_Conditions_ID, trxName);
      /** if (TWP_Profile_Conditions_ID == 0)
        {
			setTWP_Medical_Conditions_ID (0);
			setTWP_Profile_Conditions_ID (0);
			setTWP_Profile_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TWP_Profile_Conditions (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_TWP_Profile_Conditions[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Note.
		@param Note 
		Optional additional user defined information
	  */
	public void setNote (String Note)
	{
		set_Value (COLUMNNAME_Note, Note);
	}

	/** Get Note.
		@return Optional additional user defined information
	  */
	public String getNote () 
	{
		return (String)get_Value(COLUMNNAME_Note);
	}

	public I_TWP_Medical_Conditions getTWP_Medical_Conditions() throws RuntimeException
    {
		return (I_TWP_Medical_Conditions)MTable.get(getCtx(), I_TWP_Medical_Conditions.Table_Name)
			.getPO(getTWP_Medical_Conditions_ID(), get_TrxName());	}

	/** Set The Wellness Project Medical Conditions.
		@param TWP_Medical_Conditions_ID The Wellness Project Medical Conditions	  */
	public void setTWP_Medical_Conditions_ID (int TWP_Medical_Conditions_ID)
	{
		if (TWP_Medical_Conditions_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Medical_Conditions_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Medical_Conditions_ID, Integer.valueOf(TWP_Medical_Conditions_ID));
	}

	/** Get The Wellness Project Medical Conditions.
		@return The Wellness Project Medical Conditions	  */
	public int getTWP_Medical_Conditions_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Medical_Conditions_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set The Wellness Project Medical History for Profiles.
		@param TWP_Profile_Conditions_ID The Wellness Project Medical History for Profiles	  */
	public void setTWP_Profile_Conditions_ID (int TWP_Profile_Conditions_ID)
	{
		if (TWP_Profile_Conditions_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Profile_Conditions_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Profile_Conditions_ID, Integer.valueOf(TWP_Profile_Conditions_ID));
	}

	/** Get The Wellness Project Medical History for Profiles.
		@return The Wellness Project Medical History for Profiles	  */
	public int getTWP_Profile_Conditions_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Profile_Conditions_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TWP_Profile_Conditions_UU.
		@param TWP_Profile_Conditions_UU TWP_Profile_Conditions_UU	  */
	public void setTWP_Profile_Conditions_UU (String TWP_Profile_Conditions_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TWP_Profile_Conditions_UU, TWP_Profile_Conditions_UU);
	}

	/** Get TWP_Profile_Conditions_UU.
		@return TWP_Profile_Conditions_UU	  */
	public String getTWP_Profile_Conditions_UU () 
	{
		return (String)get_Value(COLUMNNAME_TWP_Profile_Conditions_UU);
	}

	public I_TWP_Profile getTWP_Profile() throws RuntimeException
    {
		return (I_TWP_Profile)MTable.get(getCtx(), I_TWP_Profile.Table_Name)
			.getPO(getTWP_Profile_ID(), get_TrxName());	}

	/** Set Wellness Profile.
		@param TWP_Profile_ID Wellness Profile	  */
	public void setTWP_Profile_ID (int TWP_Profile_ID)
	{
		if (TWP_Profile_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Profile_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Profile_ID, Integer.valueOf(TWP_Profile_ID));
	}

	/** Get Wellness Profile.
		@return Wellness Profile	  */
	public int getTWP_Profile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Profile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}