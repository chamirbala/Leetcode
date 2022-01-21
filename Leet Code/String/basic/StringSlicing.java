public class StringSlicing{
    public static void main(String[]args){
        String name="siva karthikeyan";
        //string value convert into character array
        char[] ch=name.toCharArray();
        //slicing begin position in a string
        int begin=7;
        //create 2nd another character array and size=1st length-begin position
        char[] ch2=new char[ch.length-begin];
        int j=0;
        for(int i=begin;i<ch.length;i++){
            //to put value from char array1 to char array2
            ch2[j]=ch[i];
            j++;
        }
        //convert char array to string
        name=new String(ch2);
        System.out.println(name);
    }
}