package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {	

	static Scanner sc = new Scanner(System.in);
	
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
		
		
		System.out.println("=== Teste 3: seller find all ===");
		
		Seller novoCorno = new Seller(null, "MAcaco", "masqueico@gmail.com", new Date(), 2000.0, department);
		sellerDAO.insert(novoCorno);
		System.out.println("Inserted. New id = " + novoCorno.getId());
		
		System.out.println("\n=== TEST 5: seller update =====");
		seller3 = sellerDAO.findById(1);
		seller3.setName("Martha Waine");
		sellerDAO.update(seller3);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: seller delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDAO.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
 