package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

public class Teste {

	public static void main(String[] args) {
		DepartmentDAO departmentDAO = DaoFactory.createDepatmentDAO();

		/*
		Department novoDep = new Department(null, "Almoxarife");
		departmentDAO.insert(novoDep);
		System.out.println("Inserted. New id = " + novoDep.getId());

	    */
		
		/*
		Department dep = departmentDAO.findById(3);
		System.out.println(dep);
		*/
		
		List<Department> list = departmentDAO.findAll();
		for (Department dep2: list) {
			System.out.println(dep2);
		}
		
		
		
	}}


