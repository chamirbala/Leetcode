public class XpatternReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Program";
		int len=s.length();
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				char ch=s.charAt(i);
				char ch2=s.charAt(j);
				if(i==j && i==(len-1)/2)
				{
					System.out.print(ch);
					break;
				}
				if(i==j)
					System.out.print(ch);
				
				if(i+j==6)
					System.out.print(ch2);
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
