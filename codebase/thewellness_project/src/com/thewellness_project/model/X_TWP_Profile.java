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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TWP_Profile
 *  @author iDempiere (generated) 
 *  @version Release 4.1 - $Id$ */
public class X_TWP_Profile extends PO implements I_TWP_Profile, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170710L;

    /** Standard Constructor */
    public X_TWP_Profile (Properties ctx, int TWP_Profile_ID, String trxName)
    {
      super (ctx, TWP_Profile_ID, trxName);
      /** if (TWP_Profile_ID == 0)
        {
			setblood_pressure (null);
			setdate_of_birth (new Timestamp( System.currentTimeMillis() ));
			setEMail (null);
			setfirst_name (null);
			setgender (null);
			setHeight (Env.ZERO);
			setid_number (0);
			setlast_name (null);
			setmobile_number (null);
			setTWP_Profile_ID (0);
			setWeight (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_TWP_Profile (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_TWP_Profile[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set add_whatsapp.
		@param add_whatsapp add_whatsapp	  */
	public void setadd_whatsapp (boolean add_whatsapp)
	{
		set_Value (COLUMNNAME_add_whatsapp, Boolean.valueOf(add_whatsapp));
	}

	/** Get add_whatsapp.
		@return add_whatsapp	  */
	public boolean isadd_whatsapp () 
	{
		Object oo = get_Value(COLUMNNAME_add_whatsapp);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set blood_pressure.
		@param blood_pressure blood_pressure	  */
	public void setblood_pressure (String blood_pressure)
	{
		set_Value (COLUMNNAME_blood_pressure, blood_pressure);
	}

	/** Get blood_pressure.
		@return blood_pressure	  */
	public String getblood_pressure () 
	{
		return (String)get_Value(COLUMNNAME_blood_pressure);
	}

	/** Set breast_feeding.
		@param breast_feeding breast_feeding	  */
	public void setbreast_feeding (String breast_feeding)
	{
		set_Value (COLUMNNAME_breast_feeding, breast_feeding);
	}

	/** Get breast_feeding.
		@return breast_feeding	  */
	public String getbreast_feeding () 
	{
		return (String)get_Value(COLUMNNAME_breast_feeding);
	}

	/** Set date_of_birth.
		@param date_of_birth date_of_birth	  */
	public void setdate_of_birth (Timestamp date_of_birth)
	{
		set_Value (COLUMNNAME_date_of_birth, date_of_birth);
	}

	/** Get date_of_birth.
		@return date_of_birth	  */
	public Timestamp getdate_of_birth () 
	{
		return (Timestamp)get_Value(COLUMNNAME_date_of_birth);
	}

	/** Set delivery_address.
		@param delivery_address delivery_address	  */
	public void setdelivery_address (String delivery_address)
	{
		set_Value (COLUMNNAME_delivery_address, delivery_address);
	}

	/** Get delivery_address.
		@return delivery_address	  */
	public String getdelivery_address () 
	{
		return (String)get_Value(COLUMNNAME_delivery_address);
	}

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set first_name.
		@param first_name first_name	  */
	public void setfirst_name (String first_name)
	{
		set_Value (COLUMNNAME_first_name, first_name);
	}

	/** Get first_name.
		@return first_name	  */
	public String getfirst_name () 
	{
		return (String)get_Value(COLUMNNAME_first_name);
	}

	/** Set gender.
		@param gender gender	  */
	public void setgender (String gender)
	{
		set_Value (COLUMNNAME_gender, gender);
	}

	/** Get gender.
		@return gender	  */
	public String getgender () 
	{
		return (String)get_Value(COLUMNNAME_gender);
	}

	/** Set goal_weight.
		@param goal_weight goal_weight	  */
	public void setgoal_weight (BigDecimal goal_weight)
	{
		set_Value (COLUMNNAME_goal_weight, goal_weight);
	}

	/** Get goal_weight.
		@return goal_weight	  */
	public BigDecimal getgoal_weight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_goal_weight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set hear_us_by.
		@param hear_us_by hear_us_by	  */
	public void sethear_us_by (String hear_us_by)
	{
		set_Value (COLUMNNAME_hear_us_by, hear_us_by);
	}

	/** Get hear_us_by.
		@return hear_us_by	  */
	public String gethear_us_by () 
	{
		return (String)get_Value(COLUMNNAME_hear_us_by);
	}

	/** Set Height.
		@param Height Height	  */
	public void setHeight (BigDecimal Height)
	{
		set_Value (COLUMNNAME_Height, Height);
	}

	/** Get Height.
		@return Height	  */
	public BigDecimal getHeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Height);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set id_number.
		@param id_number id_number	  */
	public void setid_number (int id_number)
	{
		set_Value (COLUMNNAME_id_number, Integer.valueOf(id_number));
	}

	/** Get id_number.
		@return id_number	  */
	public int getid_number () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_id_number);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set last_name.
		@param last_name last_name	  */
	public void setlast_name (String last_name)
	{
		set_Value (COLUMNNAME_last_name, last_name);
	}

	/** Get last_name.
		@return last_name	  */
	public String getlast_name () 
	{
		return (String)get_Value(COLUMNNAME_last_name);
	}

	/** Set middle_name.
		@param middle_name middle_name	  */
	public void setmiddle_name (String middle_name)
	{
		set_Value (COLUMNNAME_middle_name, middle_name);
	}

	/** Get middle_name.
		@return middle_name	  */
	public String getmiddle_name () 
	{
		return (String)get_Value(COLUMNNAME_middle_name);
	}

	/** Set mobile_number.
		@param mobile_number mobile_number	  */
	public void setmobile_number (String mobile_number)
	{
		set_Value (COLUMNNAME_mobile_number, mobile_number);
	}

	/** Get mobile_number.
		@return mobile_number	  */
	public String getmobile_number () 
	{
		return (String)get_Value(COLUMNNAME_mobile_number);
	}

	/** Set other_number.
		@param other_number other_number	  */
	public void setother_number (String other_number)
	{
		set_Value (COLUMNNAME_other_number, other_number);
	}

	/** Get other_number.
		@return other_number	  */
	public String getother_number () 
	{
		return (String)get_Value(COLUMNNAME_other_number);
	}

	/** Set postal_address.
		@param postal_address postal_address	  */
	public void setpostal_address (String postal_address)
	{
		set_Value (COLUMNNAME_postal_address, postal_address);
	}

	/** Get postal_address.
		@return postal_address	  */
	public String getpostal_address () 
	{
		return (String)get_Value(COLUMNNAME_postal_address);
	}

	/** Set pregnant.
		@param pregnant pregnant	  */
	public void setpregnant (String pregnant)
	{
		set_Value (COLUMNNAME_pregnant, pregnant);
	}

	/** Get pregnant.
		@return pregnant	  */
	public String getpregnant () 
	{
		return (String)get_Value(COLUMNNAME_pregnant);
	}

	/** Set town_city.
		@param town_city town_city	  */
	public void settown_city (String town_city)
	{
		set_Value (COLUMNNAME_town_city, town_city);
	}

	/** Get town_city.
		@return town_city	  */
	public String gettown_city () 
	{
		return (String)get_Value(COLUMNNAME_town_city);
	}

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

	/** Set TWP_Profile_UU.
		@param TWP_Profile_UU TWP_Profile_UU	  */
	public void setTWP_Profile_UU (String TWP_Profile_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TWP_Profile_UU, TWP_Profile_UU);
	}

	/** Get TWP_Profile_UU.
		@return TWP_Profile_UU	  */
	public String getTWP_Profile_UU () 
	{
		return (String)get_Value(COLUMNNAME_TWP_Profile_UU);
	}

	/** Set vegeterian.
		@param vegeterian vegeterian	  */
	public void setvegeterian (boolean vegeterian)
	{
		set_Value (COLUMNNAME_vegeterian, Boolean.valueOf(vegeterian));
	}

	/** Get vegeterian.
		@return vegeterian	  */
	public boolean isvegeterian () 
	{
		Object oo = get_Value(COLUMNNAME_vegeterian);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Weight.
		@param Weight 
		Weight of a product
	  */
	public void setWeight (BigDecimal Weight)
	{
		set_ValueNoCheck (COLUMNNAME_Weight, Weight);
	}

	/** Get Weight.
		@return Weight of a product
	  */
	public BigDecimal getWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}