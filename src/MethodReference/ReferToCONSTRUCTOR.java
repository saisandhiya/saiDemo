package MethodReference;

interface Messageable{
	Message someMsg(String msg);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class ReferToCONSTRUCTOR {
	public static void main(String[] args) {
		
		Messageable m = Message::new;// referring to a constructor
		m.someMsg("Icey");
		
	}
	
	}


