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

/** Generated Model for TWP_Wellness_State
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_TWP_Wellness_State extends PO implements I_TWP_Wellness_State, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170710L;

    /** Standard Constructor */
    public X_TWP_Wellness_State (Properties ctx, int TWP_Wellness_State_ID, String trxName)
    {
      super (ctx, TWP_Wellness_State_ID, trxName);
      /** if (TWP_Wellness_State_ID == 0)
        {
			setTWP_Wellness_State_ID (0);
			setwellness (null);
        } */
    }

    /** Load Constructor */
    public X_TWP_Wellness_State (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TWP_Wellness_State[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set The Wellness Project Wellness States.
		@param TWP_Wellness_State_ID The Wellness Project Wellness States	  */
	public void setTWP_Wellness_State_ID (int TWP_Wellness_State_ID)
	{
		if (TWP_Wellness_State_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Wellness_State_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Wellness_State_ID, Integer.valueOf(TWP_Wellness_State_ID));
	}

	/** Get The Wellness Project Wellness States.
		@return The Wellness Project Wellness States	  */
	public int getTWP_Wellness_State_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Wellness_State_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TWP_Wellness_State_UU.
		@param TWP_Wellness_State_UU TWP_Wellness_State_UU	  */
	public void setTWP_Wellness_State_UU (String TWP_Wellness_State_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TWP_Wellness_State_UU, TWP_Wellness_State_UU);
	}

	/** Get TWP_Wellness_State_UU.
		@return TWP_Wellness_State_UU	  */
	public String getTWP_Wellness_State_UU () 
	{
		return (String)get_Value(COLUMNNAME_TWP_Wellness_State_UU);
	}

	/** Set wellness.
		@param wellness wellness	  */
	public void setwellness (String wellness)
	{
		set_Value (COLUMNNAME_wellness, wellness);
	}

	/** Get wellness.
		@return wellness	  */
	public String getwellness () 
	{
		return (String)get_Value(COLUMNNAME_wellness);
	}
}