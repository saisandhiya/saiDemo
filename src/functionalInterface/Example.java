package functionalInterface;

// It can have any number of default, static methods but can contain only one abstract method

interface Drawable{
	public void draw();
}

public class Example implements Drawable{

	
	public void draw() {
		System.out.println("Draw a bike");
	}
	
	public static void main(String[] args) {
		
		Example e = new Example();
		e.draw();
		
	}
	
	

}
