import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FunWithArrayList {

	public static void main(String[] args) {
		ArrayList<String> strArrayList = new ArrayList<String>();
		
		strArrayList.add("C");
		strArrayList.add("Z");
		strArrayList.add("bbb");
		
		String a = strArrayList.get(0);
		String b = strArrayList.get(1);
		
		if(b.compareTo(a) == 0 )
			System.out.println( "strings are equal");
		else if(b.compareTo(a) == 1)
			System.out.println("a is lexigraphically before b");
		else if(b.compareTo(a) == -1)
			System.out.println("b is lexigraphically before a");
		
		// the size of the ArrayList is
		System.out.println( "length: " + strArrayList.size());
		
		strArrayList.add(1, "ccc" );
		
		for(int i=0; i<strArrayList.size(); i++)
		{
			System.out.println( "location[" + i + "] contains " + strArrayList.get(i));
		}
		
		Collections.sort(strArrayList);
		
		for(int i=0; i<strArrayList.size(); i++)
		{
			System.out.println( "location[" + i + "] contains " + strArrayList.get(i));
		}

		Iterator itr = strArrayList.iterator();
		
		while( itr.hasNext() )
		{
		    System.out.println( itr.next() );
		}
		
	}

}
