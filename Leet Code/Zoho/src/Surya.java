
public class Surya extends Sivakumar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am surya");
		Sivakumar sk=new Sivakumar();
		Surya sr=new Surya();
		
		sr.act();
		sk.Act();
	}
	//same method name
	//same argument
	//same type
	//method overriding === runtime polymorphism
	public void act() {
		System.out.println("Surya is acting");
	}

}
