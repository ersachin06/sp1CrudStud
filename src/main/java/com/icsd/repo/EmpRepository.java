package com.icsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icsd.model.EmpModel;

public interface EmpRepository extends JpaRepository<EmpModel	, Integer>
{

}
