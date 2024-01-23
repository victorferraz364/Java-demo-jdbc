package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDAO = DaoFactory.createSellerDAO();
		System.out.println("=== Teste 1: seller findByID ===");
		Seller seller3 = sellerDAO.findById(4);
		System.out.println(seller3);
	
		System.out.println("=== Teste 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.fyndByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== Teste 3: seller find all ===");
		
		

		list = sellerDAO.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
 