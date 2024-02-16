package Lambda;

//The Lambda expression is used to provide the 
//implementation of an interface which has functional interface.
// In case of lambda expression, we don't need to define the method 
//again for providing the implementation. Here, we just write the implementation code.

interface Drawable {
	public void draw();
}

public class LambdaExp {
	public static void main(String[] args) {

		String a = "car";
		
		Drawable d = ()->System.out.println("Draw a "+a);
		/*
		 * Drawable d = new Drawable() {
		 * 
		 * public void draw() { System.out.println("Draw a "+a); } };
		 */
		d.draw();
	}

}
