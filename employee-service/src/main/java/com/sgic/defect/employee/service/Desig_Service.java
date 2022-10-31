package com.sgic.defect.employee.service;


	import java.util.List;

import com.sgic.defect.employee.entities.Designation_entity;



	public interface Desig_Service {
		
		public  Designation_entity saveDesignation(Designation_entity designation);
		
		public List<Designation_entity> findAllDesignation();
		
	    public String getDesignation(Long designation_id);
		
		public Designation_entity updateDesignation(Designation_entity designation, Long designation_id);
		
		public String deleteDesignation(Long designation_id);

	}


