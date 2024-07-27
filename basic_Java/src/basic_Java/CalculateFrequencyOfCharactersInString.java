package basic_Java;

import java.util.HashMap;

public class CalculateFrequencyOfCharactersInString {
           public static void main(String[]args) {
        	   HashMap<Character,Integer> map=new HashMap<>();
        	   String str="articless";
        	  for(int i=0;i<str.length();i++) {
        	   if(map.get(str.charAt(i))==null) {
        		   map.put(str.charAt(i),1);
        	   }
        	   else {
        		   map.put(str.charAt(i),map.get(str.charAt(i))+1);
        	   }
           }
        	  
//      		for (Character i: map.keySet()) {
//            
//                System.out.print(i);
//                System.out.print(map.get(i)+" ");
//            }
        	  
        	  for(char i='a'; i<='z';i++) {
        		  if(map.containsKey(i)) {
        			  System.out.print(i);
                    System.out.print(map.get(i)+" ");
        		  }
        	  }
        	  
           }
}
