
public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<150;i++) {
			if(i==30) {
				break;
			}
			if(i==25) {
				continue;
			}
			System.out.println(i);
		}
	}
}
