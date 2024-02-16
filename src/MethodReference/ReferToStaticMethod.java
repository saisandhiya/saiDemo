package MethodReference;

//Method reference is used to refer method of functional interface. 
// It is compact and easy form of lambda expression.

interface Sayable{
	public void say();
}
public class ReferToStaticMethod {
	
	public static void something() {
		System.out.println("something");
	}
	
	public static void main(String[] args) {
		
		
		Sayable sayable=ReferToStaticMethod::something; //referring a static method to
		                                             //it's functional method say().
		sayable.say();
	}

}
