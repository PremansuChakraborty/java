package basic_Java;

public class CountnoofEvennoofDigit {
//Count no of Even no of Digit
	public static void main(String[]args) {
		int[] ar= {
	        56,423,1,0,86,9,4,5,12,130,2,22,8,9,75,-5
		};
		int count=0;
//		for(int i: ar) {
//			int size=0;
//			if(i>0) {
//			 size=(Integer.toString(i)).length();
//			}
//			else {
//				size=(Integer.toString(i)).length()-1;
//			}
//			if(size%2==0) {
//				count++;
//				System.out.print(i+" ");
//			}
		//method 2. log10(75)=1.875, log10(1563)=3.194
		
		for(int i:ar) {
			int size= (int)Math.log10(i)+1;
			if(size%2==0) {
			count++;
			System.out.print(i+" ");
		}
		}
			
		
		System.out.println();
		System.out.print(count);
	}
}
