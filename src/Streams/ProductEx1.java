package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	int id;
	String pname;
	float price;

	public Product(int id, String pname, float price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}
}

public class ProductEx1 {
	public static void main(String[] args) {
		
		List<Product> p = new ArrayList<>();
		p.add(new Product(11,"lap",70000));
		p.add(new Product(21,"tv",46000));
		p.add(new Product(31,"phone",26000));
		
		Set<Float> list=p.stream()
				.filter(p1->p1.price>20000)
				.map(p1->p1.price)
				.collect(Collectors.toSet());
		System.out.println(list);
		
	}

}
