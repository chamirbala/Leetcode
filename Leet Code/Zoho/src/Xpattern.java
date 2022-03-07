
public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Program";
		int len=s.length();
		
		for(int i=0;i<len;i++) {
			for(int j=len-1;j>=0;j--) {
				char ch=s.charAt(i);
				//char ch2=s.charAt(j);
				if(i+j==len-1 || i==j) {
					System.out.print(ch);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
