package com.netocalegari.javafxjdbc.model.dao;

import java.util.List;

import com.netocalegari.javafxjdbc.model.entities.Department;
import com.netocalegari.javafxjdbc.model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
