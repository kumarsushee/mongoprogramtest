package com.mongoApplicationmo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mongoApplicationmo.model.EmployeeModel;

public interface EmployeeRepo extends MongoRepository<EmployeeModel, Integer> {

	
	
	@Query("{'name':?0}")
	List<EmployeeModel> findEmployeeByName(String name);

}
