package basic_Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
//import java.util.Iterator;
public class hashSet {
	public static void main (String[]args) {
  HashSet<String> str=new HashSet<>();
  System.out.println(str);
  
  str.add("prem");
  str.add("sayan");
  str.add("prabhu");
  str.add("soureen");
  System.out.println(str);
  
  str.add("soureen");// no change cause do not add 
  System.out.println(str);
  
  System.out.println(str.size());
  
  System.out.println(str.contains("souvik"));
  
  str.remove("soureen");
  
  //Access HashSet Elements
  
//  Iterator<String> iterate = str.iterator();
//  System.out.print("HashSet using Iterator: ");
//  // Accessing elements
//  while(iterate.hasNext()) {
//      System.out.print(iterate.next());
//      System.out.print(", ");
//  }
  for (Object i: str) {

      System.out.println(i);
  }
  str.clear();
  System.out.println(str);
  
  
  ArrayList<Integer> list = new ArrayList<>();
  list.add(5);
  list.add(5);
  list.add(8);
  list.add(9);
  list.add(11);
  list.add(9);
  System.out.println(list);
  HashSet<Integer> numSet= new HashSet<>();
  
  numSet.addAll(list);
  
  System.out.println(numSet);
  
  //ordered set vvip
  //ordered in case of String lexiographycall order;
  
  TreeSet<String> str2= new TreeSet<>();
  str2.add("prem");
  str2.add("sayan");
  str2.add("probhu");
  str2.add("soureen");
  System.out.println(str2);
  
  String[] ar=new String[str.size()];
  str.toArray(ar);
  System.out.println(Arrays.toString(ar));
  
}
}
