package com.netocalegari.javafxjdbc.model.services;

import com.netocalegari.javafxjdbc.model.dao.DaoFactory;
import com.netocalegari.javafxjdbc.model.dao.DepartmentDao;
import com.netocalegari.javafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();
    public List<Department> findAll() {
        return dao.findAll();
    }
}
