public class StringReverse{
    public static void main(String[]args){
        String names="siva karthikeyan";
        StringReverse obj=new StringReverse();
        String b=obj.reverse(names);
        System.out.print("output:"+b);
    }
    public String reverse(String name){
        //String name;
        char[] ch=name.toCharArray();
        char[] ch2=new char[name.length()];
        int j;
        j=0;
       for(int i=name.length()-1;i>=0;i--){
           ch2[j]=ch[i];
            j++;
       }
       
        name=new String(ch2);
       // System.out.println(name);
        return name;
    }
}