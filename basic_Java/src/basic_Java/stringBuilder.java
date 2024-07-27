package basic_Java;

public class stringBuilder {
    public static void main(String[]args) {
    	StringBuilder str=new StringBuilder(); 
    	//unlike string it does not create new object it make changes in the old obj only
//       for(int i=0;i<26;i++) {
////    	   char ch=(char)('a'+i);
////    	   System.out.println(ch);
////    	   str.append(ch);
//       }
    	 String s="jdlklsn";
  	     str.append(s);
    	 System.out.println(str);
    	 str.reverse();
    	 System.out.println(str);
    	 str.deleteCharAt(0);
    	 System.out.println(str);
    	 System.out.println("String2 capacity = "+ str.length());
    	 
    }
}
