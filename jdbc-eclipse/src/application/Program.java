package application;

import java.util.Date;
import java.util.List;

import domain.dao.DaoFactory;
import domain.dao.SellerDao;
import domain.entities.Department;
import domain.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("-=-=-=-=-=- findAll -=-=-=-=-=-");
		List<Seller> list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
				
		System.out.println("-=-=-=-=-=- insert -=-=-=-=-=-");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 2000.00, new Department(1, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}
}
