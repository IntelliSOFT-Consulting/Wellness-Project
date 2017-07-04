
CREATE TABLE adempiere.twp_profile
(
  twp_profile_id numeric(10,0) NOT NULL,
  twp_profile_uu character varying(36) DEFAULT NULL::character varying,
  ad_client_id numeric(10,0) NOT NULL,
  ad_org_id numeric(10,0) NOT NULL,
  isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  first_name character varying(255) NOT NULL,
  middle_name character varying(255),
  last_name character varying(255) NOT NULL,
  date_of_birth date NOT NULL,
  postal_address character varying(512),
  id_number integer NOT NULL,
  town_city character varying(256),
  mobile_number character varying(256) NOT NULL,
  delivery_address character varying(1024),
  other_number character varying(256),
  gender character varying(10) NOT NULL, -- MALE for male, FEMALE for female
  email character varying(512) NOT NULL,
  height numeric(6,2) NOT NULL, -- height in cm
  weight numeric(5,2) NOT NULL, -- Weight in kg
  goal_weight numeric(5,2), -- Goal weight in kg
  blood_pressure character varying(32) NOT NULL,
  add_whatsapp character(1),
  pregnant character(1), -- null for males, true or false for female
  breast_feeding character(1), -- null for male, true or false for female
  vegeterian character(1),
  hear_us_by character varying(32), -- Friends/Family(Who) ...
  CONSTRAINT twp_profile_pkey PRIMARY KEY (twp_profile_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE adempiere.twp_profile
  OWNER TO adempiere;
COMMENT ON TABLE adempiere.twp_profile
  IS 'Stores enrollment details';
COMMENT ON COLUMN adempiere.twp_profile.gender IS 'MALE for male, FEMALE for female';
COMMENT ON COLUMN adempiere.twp_profile.height IS 'height in cm';
COMMENT ON COLUMN adempiere.twp_profile.weight IS 'Weight in kg';
COMMENT ON COLUMN adempiere.twp_profile.goal_weight IS 'Goal weight in kg';
COMMENT ON COLUMN adempiere.twp_profile.pregnant IS 'null for males, true or false for female';
COMMENT ON COLUMN adempiere.twp_profile.breast_feeding IS 'null for male, true or false for female';
COMMENT ON COLUMN adempiere.twp_profile.hear_us_by IS 'Friends/Family(Who) 
Facebook 
Instagram
Website 
Magazine 
Other';

  
CREATE TABLE adempiere.twp_medical_conditions
(
  twp_medical_conditions_id numeric(10,0) NOT NULL,
  twp_medical_conditions_uu character varying(36) DEFAULT NULL::character varying,
  ad_client_id numeric(10,0) NOT NULL,
  ad_org_id numeric(10,0) NOT NULL,
  isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  condition character varying(255) NOT NULL,
  CONSTRAINT twp_medical_conditions_pkey PRIMARY KEY (twp_medical_conditions_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE adempiere.twp_medical_conditions
  OWNER TO adempiere;
COMMENT ON TABLE adempiere.twp_medical_conditions
  IS 'medical history conditions';  
  
CREATE TABLE adempiere.twp_wellness_state
(
  twp_wellness_state_id numeric(10,0) NOT NULL,
  twp_wellness_state_uu character varying(36) DEFAULT NULL::character varying,
  ad_client_id numeric(10,0) NOT NULL,
  ad_org_id numeric(10,0) NOT NULL,
  isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  wellness character varying(255) NOT NULL,
  CONSTRAINT twp_wellness_state_pkey PRIMARY KEY (twp_wellness_state_id)
) 
WITH (
  OIDS = FALSE
)
;
ALTER TABLE adempiere.twp_wellness_state
  OWNER TO adempiere;

  CREATE TABLE adempiere.twp_foods
(
  twp_foods_id numeric(10,0) NOT NULL,
  twp_foods_uu character varying(36) DEFAULT NULL::character varying,
  ad_client_id numeric(10,0) NOT NULL,
  ad_org_id numeric(10,0) NOT NULL,
  isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  food character varying(255) NOT NULL,
  CONSTRAINT twp_foods_pkey PRIMARY KEY (twp_foods_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE adempiere.twp_foods
  OWNER TO adempiere;
COMMENT ON TABLE adempiere.twp_foods
  IS 'Food choices for vegeterians';
  
  CREATE TABLE adempiere.twp_profile_conditions
(
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  twp_profile_id numeric(10,0) NOT NULL,
  twp_medical_conditions_id numeric(10,0) NOT NULL,
  note text,
  CONSTRAINT twp_profile_conditions_pkey PRIMARY KEY (twp_profile_id, twp_medical_conditions_id),
  CONSTRAINT twpprofileconditions_twpconditions FOREIGN KEY (twp_medical_conditions_id)
      REFERENCES adempiere.twp_medical_conditions (twp_medical_conditions_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT twpprofileconditions_twpprofile FOREIGN KEY (twp_profile_id)
      REFERENCES adempiere.twp_profile (twp_profile_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE adempiere.twp_profile_conditions
  OWNER TO adempiere;
  
  
CREATE TABLE adempiere.twp_profile_wellness
(
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  twp_profile_id numeric(10,0) NOT NULL,
  twp_wellness_id numeric(10,0) NOT NULL,
  CONSTRAINT twp_profile_wellness_pkey PRIMARY KEY (twp_profile_id, twp_wellness_id),
  CONSTRAINT twpprofilewellness_twpwellness FOREIGN KEY (twp_wellness_id)
      REFERENCES adempiere.twp_wellness_state (twp_wellness_state_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT twpwellnessprofile_twpprofile FOREIGN KEY (twp_profile_id)
      REFERENCES adempiere.twp_profile (twp_profile_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE adempiere.twp_profile_wellness
  OWNER TO adempiere;
  
  
CREATE TABLE adempiere.twp_profile_foods
(
  created timestamp without time zone NOT NULL DEFAULT now(),
  createdby numeric(10,0) NOT NULL,
  updated timestamp without time zone NOT NULL DEFAULT now(),
  updatedby numeric(10,0) NOT NULL,
  twp_profile_id numeric(10,0) NOT NULL,
  twp_foods_id numeric(10,0) NOT NULL,
  CONSTRAINT twp_profile_foods_pkey PRIMARY KEY (twp_profile_id, twp_foods_id),
  CONSTRAINT twpprofilefoods_twpfoods FOREIGN KEY (twp_foods_id)
      REFERENCES adempiere.twp_foods (twp_foods_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT twpprofilefoods_twpprofile FOREIGN KEY (twp_profile_id)
      REFERENCES adempiere.twp_profile (twp_profile_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE adempiere.twp_profile_foods
  OWNER TO adempiere;
  
  
