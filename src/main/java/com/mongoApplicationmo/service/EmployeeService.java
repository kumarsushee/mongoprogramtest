package com.mongoApplicationmo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongoApplicationmo.model.EmployeeModel;
import com.mongoApplicationmo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	MongoTemplate objMongoTemplate;

	@Autowired
	EmployeeRepo objEmployeeRepo;
	
	
	public String saveDetail(EmployeeModel objEmp) {
		objEmployeeRepo.save(objEmp);
		
		return "data inserted successfully";
		
	}


	public void getDetails(String name,int age) {
		
		Query q= new Query();
		q.addCriteria(Criteria.where("name").is(name));
		Update u= new Update();
		u.set("age", age);
		
	    objMongoTemplate.updateFirst(q,u,EmployeeModel.class);
		
	}

}
