package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int pid;
	String pname;
	int pprice;
	
	public Product(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
}

public class UsingCollectionProduct {
	public static void main(String[] args) {
		
		List<Product> p = new ArrayList<>();
		
		p.add(new Product(12,"Laptop",350000));
		p.add(new Product(14,"TV",460000));
		p.add(new Product(02,"Ipad",590000));
		
		Collections.sort(p,(p1,p2)->{
			return p1.pname.compareTo(p2.pname);
		});
		
		for(Product pro : p) {
			System.out.println(pro.pid+":"+pro.pname+":"+pro.pprice);
		}
		
	}
	
	

}
