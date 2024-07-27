package basic_Java;
import java.util.*;
//import java.util.ArrayList;
public class ArrayListBasics {
           public static void main(String[]args) {
        	   ArrayList<Integer> list=new ArrayList<Integer>(5);
        	   list.add(50);
        	   list.add(5);
        	   list.add(40);
        	   list.add(880);
        	   list.add(7);
        	   list.add(5410);
        	   list.add(500);
        	   list.add(123);
        	   list.add(753);
        	   list.add(589);
        	 
//        	   System.out.println(list);
//        	   System.out.println(list.get(5));
////        	   list.clear(); //clear all elements
//        	   list.remove(5);
//        	   System.out.println(list);
//        	   list.set(5, 55);
//        	   System.out.println(list);
//        	   System.out.println(list.size());
        	   
        	   //add element from command line
        	   int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        	   System.out.println(list);
        	   Scanner in = new Scanner (System.in);
        	   System.out.print("Enter no of elements: ");
        	   int ne=in.nextInt();
        	   int size=list.size();
        	   for(int i=size;i<(size+ne);i++) {
        	   list.add(in.nextInt());
        	   System.out.println(list);
        	   }
        	   System.out.println(list);
        	   in.close();
           }
}
