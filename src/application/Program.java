package application;

import java.util.Date;

import domain.entities.Department;
import domain.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Seller obj = new Seller(1, "Books", "books@gmail.com", new Date(), 2000.00, new Department(1, "Books"));
		System.out.println(obj);
	}

}
