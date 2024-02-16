package MethodReference;

interface Sayable1{
	public void say();
}
public class ReferToInstanceMethod {
	
	public void saySomething() {
		System.out.println("Say something");
	}
	
	public static void main(String[] args) {
		
		ReferToInstanceMethod refer = new ReferToInstanceMethod();
		
		Sayable1 sayable = refer::saySomething; //referring non-static methods
		sayable.say();
		
		Sayable say2 = new ReferToInstanceMethod()::saySomething; //Referring non-static method
		                                                             //using anonymous object  
		say2.say();
	}

}
