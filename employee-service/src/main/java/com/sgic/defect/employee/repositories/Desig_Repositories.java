package com.sgic.defect.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defect.employee.entities.Designation_entity;



@Repository
public interface Desig_Repositories extends JpaRepository<Designation_entity, Long> {

}
