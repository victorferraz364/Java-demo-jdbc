package application;

import java.util.Date;

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
	}

}
 