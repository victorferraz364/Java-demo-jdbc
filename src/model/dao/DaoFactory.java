package model.dao;

import db.DB;
import model.dao.impl.SellerDAO_JDBC;

public class DaoFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDAO_JDBC(DB.getConncetion());
	}
	
}
