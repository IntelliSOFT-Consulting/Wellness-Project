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

/** Generated Model for TWP_Find_Us
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_TWP_Find_Us extends PO implements I_TWP_Find_Us, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170710L;

    /** Standard Constructor */
    public X_TWP_Find_Us (Properties ctx, int TWP_Find_Us_ID, String trxName)
    {
      super (ctx, TWP_Find_Us_ID, trxName);
      /** if (TWP_Find_Us_ID == 0)
        {
			setfind_us_by (null);
			setTWP_Find_Us_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TWP_Find_Us (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TWP_Find_Us[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set find_us_by.
		@param find_us_by find_us_by	  */
	public void setfind_us_by (String find_us_by)
	{
		set_Value (COLUMNNAME_find_us_by, find_us_by);
	}

	/** Get find_us_by.
		@return find_us_by	  */
	public String getfind_us_by () 
	{
		return (String)get_Value(COLUMNNAME_find_us_by);
	}

	/** Set The Wellness Project Wellness Find Us By.
		@param TWP_Find_Us_ID The Wellness Project Wellness Find Us By	  */
	public void setTWP_Find_Us_ID (int TWP_Find_Us_ID)
	{
		if (TWP_Find_Us_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TWP_Find_Us_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TWP_Find_Us_ID, Integer.valueOf(TWP_Find_Us_ID));
	}

	/** Get The Wellness Project Wellness Find Us By.
		@return The Wellness Project Wellness Find Us By	  */
	public int getTWP_Find_Us_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TWP_Find_Us_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TWP_Find_Us_UU.
		@param TWP_Find_Us_UU TWP_Find_Us_UU	  */
	public void setTWP_Find_Us_UU (String TWP_Find_Us_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TWP_Find_Us_UU, TWP_Find_Us_UU);
	}

	/** Get TWP_Find_Us_UU.
		@return TWP_Find_Us_UU	  */
	public String getTWP_Find_Us_UU () 
	{
		return (String)get_Value(COLUMNNAME_TWP_Find_Us_UU);
	}
}