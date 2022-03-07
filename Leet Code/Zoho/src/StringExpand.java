import java.util.Scanner;
public class StringExpand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str=sc.next();
			char ch[]=str.toCharArray();
			
			if(ch.length%2!=0) {
				System.out.println("Invalid");
				continue;
			}
			String temp="";
			for(int i=0;i<ch.length-1;i=i+2) {
				char num=ch[i+1];
				if((num>=(int)'0' && num<=(int)'9' && !(ch[i]>='a' && ch[i]<='z'))) {
					System.out.println("invalid");
					temp="";
					break;
				}
				int noOfTimes =Integer.parseInt(num+"");
				while(noOfTimes-- >0) {
					temp+=ch[i];
				}
			}
			if(!temp.isEmpty()) {
				System.out.println(temp);
			}
		}
	}

}
