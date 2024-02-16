package Lambda;

interface Addable{
	public int add(int a, int b);
}

public class Twoparameter {
	public static void main(String[] args) {
		
		Addable addable = (a,b)-> a+b;	
		
		System.out.println(addable.add(83, 23));
	}

}
