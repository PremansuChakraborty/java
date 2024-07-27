package basic_Java;
import java.util.*;

public class ArrayListBasics2 {
	public static void main(String[]args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		//add lists
		
		Scanner in= new Scanner(System.in);
		System.out.print("enter Number of List: ");
		int nl = in.nextInt();
		
		for(int i=0;i<nl;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		// add elements;
		for(int i=0;i<list.size();i++) {
			System.out.print("enter Number of elements in "+(i+1)+"th list: ");
			int ne = in.nextInt();
			for(int j=0;j<ne;j++) {
				System.out.print("enter ["+i+"]["+j+"]: ");
				list.get(i).add(in.nextInt());
			}
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		in.close();
	}
}
