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
package com.thewellness_project.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for TWP_Profile
 *  @author iDempiere (generated) 
 *  @version Release 4.1
 */
@SuppressWarnings("all")
public interface I_TWP_Profile 
{

    /** TableName=TWP_Profile */
    public static final String Table_Name = "TWP_Profile";

    /** AD_Table_ID=1000000 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name add_whatsapp */
    public static final String COLUMNNAME_add_whatsapp = "add_whatsapp";

	/** Set add_whatsapp	  */
	public void setadd_whatsapp (boolean add_whatsapp);

	/** Get add_whatsapp	  */
	public boolean isadd_whatsapp();

    /** Column name blood_pressure */
    public static final String COLUMNNAME_blood_pressure = "blood_pressure";

	/** Set blood_pressure	  */
	public void setblood_pressure (String blood_pressure);

	/** Get blood_pressure	  */
	public String getblood_pressure();

    /** Column name breast_feeding */
    public static final String COLUMNNAME_breast_feeding = "breast_feeding";

	/** Set breast_feeding	  */
	public void setbreast_feeding (String breast_feeding);

	/** Get breast_feeding	  */
	public String getbreast_feeding();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name date_of_birth */
    public static final String COLUMNNAME_date_of_birth = "date_of_birth";

	/** Set date_of_birth	  */
	public void setdate_of_birth (Timestamp date_of_birth);

	/** Get date_of_birth	  */
	public Timestamp getdate_of_birth();

    /** Column name delivery_address */
    public static final String COLUMNNAME_delivery_address = "delivery_address";

	/** Set delivery_address	  */
	public void setdelivery_address (String delivery_address);

	/** Get delivery_address	  */
	public String getdelivery_address();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name first_name */
    public static final String COLUMNNAME_first_name = "first_name";

	/** Set first_name	  */
	public void setfirst_name (String first_name);

	/** Get first_name	  */
	public String getfirst_name();

    /** Column name gender */
    public static final String COLUMNNAME_gender = "gender";

	/** Set gender	  */
	public void setgender (String gender);

	/** Get gender	  */
	public String getgender();

    /** Column name goal_weight */
    public static final String COLUMNNAME_goal_weight = "goal_weight";

	/** Set goal_weight	  */
	public void setgoal_weight (BigDecimal goal_weight);

	/** Get goal_weight	  */
	public BigDecimal getgoal_weight();

    /** Column name Height */
    public static final String COLUMNNAME_Height = "Height";

	/** Set Height	  */
	public void setHeight (BigDecimal Height);

	/** Get Height	  */
	public BigDecimal getHeight();

    /** Column name id_number */
    public static final String COLUMNNAME_id_number = "id_number";

	/** Set id_number	  */
	public void setid_number (int id_number);

	/** Get id_number	  */
	public int getid_number();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name last_name */
    public static final String COLUMNNAME_last_name = "last_name";

	/** Set last_name	  */
	public void setlast_name (String last_name);

	/** Get last_name	  */
	public String getlast_name();

    /** Column name middle_name */
    public static final String COLUMNNAME_middle_name = "middle_name";

	/** Set middle_name	  */
	public void setmiddle_name (String middle_name);

	/** Get middle_name	  */
	public String getmiddle_name();

    /** Column name mobile_number */
    public static final String COLUMNNAME_mobile_number = "mobile_number";

	/** Set mobile_number	  */
	public void setmobile_number (String mobile_number);

	/** Get mobile_number	  */
	public String getmobile_number();

    /** Column name other_number */
    public static final String COLUMNNAME_other_number = "other_number";

	/** Set other_number	  */
	public void setother_number (String other_number);

	/** Get other_number	  */
	public String getother_number();

    /** Column name postal_address */
    public static final String COLUMNNAME_postal_address = "postal_address";

	/** Set postal_address	  */
	public void setpostal_address (String postal_address);

	/** Get postal_address	  */
	public String getpostal_address();

    /** Column name pregnant */
    public static final String COLUMNNAME_pregnant = "pregnant";

	/** Set pregnant	  */
	public void setpregnant (String pregnant);

	/** Get pregnant	  */
	public String getpregnant();

    /** Column name town_city */
    public static final String COLUMNNAME_town_city = "town_city";

	/** Set town_city	  */
	public void settown_city (String town_city);

	/** Get town_city	  */
	public String gettown_city();

    /** Column name TWP_Profile_ID */
    public static final String COLUMNNAME_TWP_Profile_ID = "TWP_Profile_ID";

	/** Set Wellness Profile	  */
	public void setTWP_Profile_ID (int TWP_Profile_ID);

	/** Get Wellness Profile	  */
	public int getTWP_Profile_ID();

    /** Column name TWP_Profile_UU */
    public static final String COLUMNNAME_TWP_Profile_UU = "TWP_Profile_UU";

	/** Set TWP_Profile_UU	  */
	public void setTWP_Profile_UU (String TWP_Profile_UU);

	/** Get TWP_Profile_UU	  */
	public String getTWP_Profile_UU();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name vegeterian */
    public static final String COLUMNNAME_vegeterian = "vegeterian";

	/** Set vegeterian	  */
	public void setvegeterian (boolean vegeterian);

	/** Get vegeterian	  */
	public boolean isvegeterian();

    /** Column name Weight */
    public static final String COLUMNNAME_Weight = "Weight";

	/** Set Weight.
	  * Weight of a product
	  */
	public void setWeight (BigDecimal Weight);

	/** Get Weight.
	  * Weight of a product
	  */
	public BigDecimal getWeight();
}
