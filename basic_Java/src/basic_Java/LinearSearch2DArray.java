package basic_Java;

public class LinearSearch2DArray {
	public static void main(String[]args) {
       int[][] ar= {
    		   {1,56,3,0,89,2},
    		   {55,8,9,4,0,3,2},
    		   {51,100}
       };
       returnIndex(ar,0);
       
	}
//       print all the index of a number
       static void returnIndex(int[][] a, int b) {
//    	   for(int[] i: a) {
//    		   for(int j: i) {
////    			   if(j==b) {
////    				   
//    			   System.out.println(j);
////    			   }
//    		   }
//    	   }
    	   
    	   for(int i=0;i<a.length;i++) {
    		   for(int j=0;j<a[i].length;j++) {
    			   if(a[i][j]==b) {
    			   System.out.println("["+i+"]["+j+"]");
    		   }
    		   }
    	   }
       }
       
}
