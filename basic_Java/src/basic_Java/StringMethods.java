package basic_Java;
import java.util.Arrays;
import java.util.ArrayList;
/*
 * Method	Description	Return Type
charAt()	Returns the character at the specified index (position)	char
codePointAt()	Returns the Unicode of the character at the specified index	int
codePointBefore()	Returns the Unicode of the character before the specified index	int
codePointCount()	Returns the number of Unicode values found in a string.	int
compareTo()	Compares two strings lexicographically	int
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
concat()	Appends a string to the end of another string	String
contains()	Checks whether a string contains a sequence of characters	boolean
contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
copyValueOf()	Returns a String that represents the characters of the character array	String
endsWith()	Checks whether a string ends with the specified character(s)	boolean
equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
format()	Returns a formatted string using the specified locale, format string, and arguments	String
getBytes()	Converts a string into an array of bytes	byte[]
getChars()	Copies characters from a string to an array of chars	void
hashCode()	Returns the hash code of a string	int
indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
intern()	Returns the canonical representation for the string object	String
isEmpty()	Checks whether a string is empty or not	boolean
join()	Joins one or more strings with a specified separator	String
lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
length()	Returns the length of a specified string	int
matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
regionMatches()	Tests if two string regions are equal	boolean
replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
split()	Splits a string into an array of substrings	String[]
startsWith()	Checks whether a string starts with specified characters	boolean
subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
substring()	Returns a new string which is the substring of a specified string	String
toCharArray()	Converts this string to a new character array	char[]
toLowerCase()	Converts a string to lower case letters	String
toString()	Returns the value of a String object	String
toUpperCase()	Converts a string to upper case letters	String
trim()	Removes whitespace from both ends of a string	String
valueOf()	Returns the string representation of the specified value	String
 */
public class StringMethods {
     public static void main(String[]args) {
    	 String a="Prem";
    	 String b="Sohon";
//    	 System.out.println(a.charAt(2));
    	 
    	 String str1="Hello";
    	 String str2="Jello";
//    	 System.out.println(str2.compareTo(str1)); //J-H=2
    	 String str3="jello";
//    	 System.out.println(str3.compareTo(str1)); //j-H=34
//    	 System.out.println(str3.compareToIgnoreCase(str1));//j-H=2
    	 
//    	 System.out.println(str3.concat(str1));//jelloHello //do not change the original str3
////    	 System.out.println(str3);
//    	 System.out.println(str3.contains("llo")); //true
//    	 
//    	 char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
//    	 String myStr2 = "";
//    	 myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
//    	 System.out.println("Returned String: " + myStr2);
    	 
//    	 System.out.println(str2.equals(str3)); //false
//    	 System.out.println(str2.equalsIgnoreCase(str3)); //true
//    	 
    	 String myStr = "Hello %s! One kilobyte is %,d bytes."; //%s and %d placeholder
//    	    String result = String.format(myStr, "World", 1024);
//    	    System.out.println(result);
//    	    System.out.printf("Hello %s! One kilobyte is %,d bytes.%n","world",1024);//same output
//    	 System.out.println(myStr.indexOf("O")); //First index of O.
//    	 System.out.println(myStr.lastIndexOf("e")); //last index of e.
//    	 
//    	 System.out.println(myStr.isEmpty()); //false
//    	 
//    	 String fruits = String.join("//", "Orange", "Apple", "Mango"); //first entry of the separator then all the strings
//    	    System.out.println(fruits);
    	 
//    	 System.out.println(myStr.length());
//    	 
//    	 System.out.println(str1.replace('l', 'p'));//Hello-->Heppo
//    	 
    	 String myStr2 = "I love Cats. Cats are very easy to love. Cats are very popular.";
//    	 String regex = "Cat";
//    	 System.out.println(myStr2.replaceAll(regex, "Dog"));
    	 
//    	 System.out.println(myStr2.replaceFirst("Cat","Dog"));
    	 
//    	 System.out.println(myStr2.startsWith("I lo"));
//    	 System.out.println(myStr2.endsWith("lar."));
    	  
//    	 String[] myChar=myStr2.split("\\s+");  // \\s+ remove one or more spaces  //[I, love, Cats., Cats, are, very, easy, to, love., Cats, are, very, popular.]
//    	 System.out.println(Arrays.toString(myChar));
    	 
//    	 char[] myChar2=myStr2.toCharArray(); // [I,  , l, o, v, e,  , C, a, t, s, .,  , C, a, t, s,  , a, r, e,  , v, e, r, y,  , e, a, s, y,  , t, o,  , l, o, v, e, .,  , C, a, t, s,  , a, r, e,  , v, e, r, y,  , p, o, p, u, l, a, r, .]
//    	 System.out.println(Arrays.toString(myChar2));
    	 String myStrs = "Hello, World!";
    	 System.out.println(myStrs.substring(7, 12));
    	 
    	 System.out.println(myStr.toLowerCase());
    	 System.out.println(myStr.toUpperCase());
    	 
    	 String str5="   hello   ";
    	 System.out.println(str5.trim());
    	 
          int[][] ar= {
        		  {5,6,8,9},
        		  {41,20,3,5,6,21,7},
        		  {56,23,50}
          };
          
    	 for (int i=0;i<ar.length;i++) {
    		 System.out.println(Arrays.toString(ar[i]));
    	 }
    	 
    	 //convert the values to string
    	 double num=6.5554664;
    	 String str6=String.valueOf(num);//Double.toString(num);
    	 System.out.println(str6);
    	 String input="akskkkknaadkp";
    	 input=input.replaceAll("a","");
    	 System.out.println(input);
  
     }
}
