package com.sgic.defect.employee.service;


	import java.util.List;
import java.util.Objects;
import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.sgic.defect.employee.entities.Designation_entity;
import com.sgic.defect.employee.repositories.Desig_Repositories;


	@Service
	public class DesigServImpl implements Desig_Service {
		
		@Autowired
		private Desig_Repositories designationRepo;

		@Override
		public Designation_entity saveDesignation(Designation_entity designation) {
			
			return designationRepo.save(designation);
		}

		@Override
		public List<Designation_entity> findAllDesignation() {
			
			return (List<Designation_entity>) designationRepo.findAll();
		}

		@Override
		public String getDesignation(Long designation_id) {
			if(designationRepo.existsById(designation_id)) {
				Optional<Designation_entity> std = designationRepo.findById(designation_id);
			return "Data found"+ std;}
			else {
			return "Data not found";}
		}

		@Override
		public Designation_entity updateDesignation(Designation_entity designation, Long designation_id) {
			
			Designation_entity desDB = designationRepo.findById(designation_id)
	              .get();
			if(Objects.nonNull(designation.getDesignation_name())) {
				desDB.setDesignation_name(designation.getDesignation_name());
			}
			if(Objects.nonNull(designation.isApproval())) {
				desDB.setApproval(designation.isApproval());
			}
			
			return designationRepo.save(desDB);
		}

		@Override
		public String deleteDesignation(Long designation_id) {
			
			if(designationRepo.existsById(designation_id)) {
				designationRepo.deleteById(designation_id);
			return "designationID:"+designation_id+": data deleted";
			}else {
				return "data doesn't exist";
			}
		
		}

		
		

	}
