package basic_Java;
import java.util.*;
public class PrimeNum {
//	static int isPrime(int N){
//
//        if(N==1)return 0;
//        if(N<=3)return 1;
//        if(N%2==0 || N%3==0) return 0;
//        
//        for (int i = 5; i * i <= N; i += 6) {
//            if (N % i == 0 || N % (i + 2) == 0) {
//                return 0;
//            }
//        }
//        return 1;
//        // code here
//    }
	
	static int isPrime(int N){
		int root=(int)Math.sqrt(N);
		
		 if(N<=1)return 0;
       if(N<=3)return 1;
       
       for (int i =2; i<= root; i++) {
           if (N % i == 0) {
               return 0;
           }
       }
       return 1;
		
	}
	public static ArrayList<Integer> primeNumbersTillN(int N) 
	{ 
	 	// Write your code here
		 if(N<=1) return new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
		
		for(int j=2;j<=N;j++){
		 if(isPrime(j)==1) list.add(j);
		}
		 return list;
	}
	
	
	
      public static void main(String[]args) {
    	  Scanner obj=new Scanner (System.in);
    	  System.out.print("Enter non-zero Num: ");
    	  int num=obj.nextInt();
    	  isPrime(num);
    	  System.out.println(primeNumbersTillN(num));
    	  obj.close();
      }
}
