package basic_Java;

public class CapitalizeFirstAndLastCharacterOfEachWord {
	public static void main(String[] args) {
        String s="take u forward is awesome";
        String res="";
        for(int i=0;i<s.length();i++){
        	char ch=s.charAt(i);
               if(i==0 || i==s.length()-1){
                ch=Character.toUpperCase(ch);
                 res=res+ch;
                 }
            else if(s.charAt(i+1)==' ' || s.charAt(i-1)==' '){
            	ch=Character.toUpperCase(ch);
                res=res+ch;
            }
            else {
            	res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
