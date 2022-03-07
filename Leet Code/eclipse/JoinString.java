package hello;

public class JoinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinString js=new JoinString();
		String[] s= {"bala","kali","raja"};
		js.connectString(s);
	}

	private void connectString(String[] s) {
		// TODO Auto-generated method stub
		String s2="";
		for(String name:s) {
			s2+=name+" ";
		}
		
		System.out.println(s2);
	}

}
