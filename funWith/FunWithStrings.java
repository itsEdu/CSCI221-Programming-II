
public class FunWithStrings {

	public static void main(String[] args) {
		
		String string = "This is a string";
		StringBuffer strbuf = new StringBuffer( "This is a stringbuffer" );
		
		// length of the string
		System.out.println("the length of string is: " + string.length());
		
		// count the number of 'i' characters in the string
		int count = 0;
		for( int index = 0; index < string.length(); index++ )
			if(string.charAt(index) == 'i')
				count++;
		
		System.out.println("the string has " + count + " 'i' characters");
		
		System.out.println("the string in upper case: " + string.toUpperCase() );
		
		System.out.println( string );
		
		// print identityHashCode()
		System.out.println( "string's hashcode: " + System.identityHashCode(string));
		System.out.println( "strbuf's hashcode: " + System.identityHashCode(strbuf));
			
		// concatenate to the string, for the StringBuffer call its append method
		string += "! I hope you like it.";
		strbuf.append("! I hope you like it.");
						
		// verify contents and identityHashCode
		System.out.println( "string contents: " + string );
		System.out.println( "string's hashcode: " + System.identityHashCode(string));
		System.out.println();
		System.out.println( "strbuf contents: " + strbuf );
		System.out.println( "strbuf's hashcode: " + System.identityHashCode(strbuf));
				
	}

}
