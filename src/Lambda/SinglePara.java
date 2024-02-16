package Lambda;

interface Name{
	public void Student(String name);
}

public class SinglePara {
	public static void main(String[] args) {
		
		Name n =(name)->System.out.println("Hello "+name);
		
		n.Student("Icey");
	}
	

}
