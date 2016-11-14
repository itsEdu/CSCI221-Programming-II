
public class FunWithPrimitiveTypes {
		
	public static void main( String[] args ){
		int i = 10;
		float f = 10.99f;
		long l = 100;
		double d = 10.253;
		int result;
		
		i = (int)f;
		System.out.println( "the value of i is: " + i );
		
		f = (float)d;
		System.out.println( "the value of f is: " + f );
		
		f = i;
		System.out.println( "the value of f is: " + f );
		
		result = i / 3;
		System.out.println( "the value of result is: " + result );
		
		result = i % 3;
		System.out.println( "the value of result is: " + result );
			
	}
}
