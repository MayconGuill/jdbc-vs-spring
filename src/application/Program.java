package application;

import java.util.Date;

import domain.dao.DaoFactory;
import domain.dao.SellerDao;
import domain.entities.Department;
import domain.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
	}
}
