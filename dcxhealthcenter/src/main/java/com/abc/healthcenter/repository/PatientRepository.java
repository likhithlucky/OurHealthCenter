/**
 * 
 */
package com.abc.healthcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.abc.healthcenter.entity.PatientEntity;

/**
 * @author admin
 *
 * date: Jul 5, 2021

 */


	public interface PatientRepository extends JpaRepository<PatientEntity,Integer>{
		
		
	}

