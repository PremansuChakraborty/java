package basic_Java;

//store only the even integrs.
public class Array2 {
	     
		public static int[] storeOddOnly(int[] ar) {
			int n= countOdd(ar);
			int[] resultArray= new int[n];
			int index = 0;
			for(int i=0; i<ar.length;i++) {
				if (ar[i]%2!=0) {
					resultArray[index]=ar[i];
					index++;
				}
			}
			return resultArray;
		}
		
		public static int countOdd(int[] arr) {
			int count=0;
			for(int i=0; i<arr.length;i++) {
				if (arr[i]%2!=0) {
					count++;
				}
			}
			return count;
		}
		
        public static void printArray(int[] arr) {
      	  for(int i=0; i<arr.length;i++) {
      		  System.out.println(i+1+"th element: "+ arr[i]);
      	  }
        }
		
	
         public static void main(String[]args) {
        	 int[] myArray= {5,12,3,6,9,7,4,56,1,23,0,51,6,75};
        	 printArray(storeOddOnly(myArray));
         }
}
