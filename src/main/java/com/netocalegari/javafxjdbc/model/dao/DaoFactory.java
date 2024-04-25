package com.netocalegari.javafxjdbc.model.dao;

import com.netocalegari.javafxjdbc.db.DB;
import com.netocalegari.javafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.netocalegari.javafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
