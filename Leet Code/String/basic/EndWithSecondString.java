public class EndWithSecondString{
    public static void main(String[]args){
        String name="siva karthikeyan";
        String name2="keyan";
       int m=name.length();
       int n=name2.length();
       n--;
       m--;
       int count=0;
        while(n>=0){
            if(name.charAt(m)==name2.charAt(n)){
                n--;
                m--;
                count++;
            }
            else{
                break;
            }
        }
      if(count==name2.length())
        System.out.println("ri8");
      else
        System.out.println("wrong");
    }
}