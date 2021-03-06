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

/** Generated Model for TWP_Profile_Foods
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_TWP_Profile_Foods extends PO implements I_TWP_Profile_Foods, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170710L;

    /** Standard Constructor */
    public X_TWP_Profile_Foods (Properties ctx, int TWP_Profile_Foods_ID, String trxName)
    {
      super (ctx, TWP_Profile_Foods_ID, trxName);
      /** if (TWP_Profile_Foods_ID == 0)
        {
			setTWP_Foods_ID (0);
			setTWP_Profile_Foods_ID (0);
			setTWP_Profile_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TWP_Profile_Foods (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TWP_Profile_Foods[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_TWP_Foods getTWP_Foods() throws RuntimeException
    {
		return (I_TWP_Foods)MTable.get(getCtx(), I_TWP_Foods.Table_Name)
			.getPO(getTWP_Foods_ID(), get_TrxName());	}

	/** Set The Wellness Project Wellness Non Vegeterian Foods.
		@param TWP_Foods_ID The Wellness Project Wellness Non Vegeterian Foods	  */
	public void setTWP_Foods_ID (int TWP_Foods_ID)
	{
		if (TWP_Foods_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Foods_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Foods_ID, Integer.valueOf(TWP_Foods_ID));
	}

	/** Get The Wellness Project Wellness Non Vegeterian Foods.
		@return The Wellness Project Wellness Non Vegeterian Foods	  */
	public int getTWP_Foods_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Foods_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set The Wellness Project Vegeterian foods for Profiles.
		@param TWP_Profile_Foods_ID The Wellness Project Vegeterian foods for Profiles	  */
	public void setTWP_Profile_Foods_ID (int TWP_Profile_Foods_ID)
	{
		if (TWP_Profile_Foods_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Profile_Foods_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Profile_Foods_ID, Integer.valueOf(TWP_Profile_Foods_ID));
	}

	/** Get The Wellness Project Vegeterian foods for Profiles.
		@return The Wellness Project Vegeterian foods for Profiles	  */
	public int getTWP_Profile_Foods_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Profile_Foods_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TWP_Profile_Foods_UU.
		@param TWP_Profile_Foods_UU TWP_Profile_Foods_UU	  */
	public void setTWP_Profile_Foods_UU (String TWP_Profile_Foods_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TWP_Profile_Foods_UU, TWP_Profile_Foods_UU);
	}

	/** Get TWP_Profile_Foods_UU.
		@return TWP_Profile_Foods_UU	  */
	public String getTWP_Profile_Foods_UU () 
	{
		return (String)get_Value(COLUMNNAME_TWP_Profile_Foods_UU);
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