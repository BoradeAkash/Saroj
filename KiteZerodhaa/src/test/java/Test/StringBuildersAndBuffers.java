package Test;

import org.apache.logging.log4j.util.StringBuilders;

public class StringBuildersAndBuffers {

	public static void main(String[] args) {
		
		
	String immutable = new String("Velocity");
	StringBuffer mutable1 = new StringBuffer("Pune");
	StringBuilder mutable2 = new StringBuilder("Aurangabad");
	
	
	
	
	
	
	immutable.concat(" pune");
	System.out.println(immutable);
	
	mutable1.append(" Katraj");
	System.out.println(mutable1);
	
	mutable1.reverse();
	System.out.println(mutable1);
	
	mutable1.append(" Vel");
	System.out.println(mutable1);
	
	
	mutable2.append(" My home");
	System.out.println(mutable2);
	
	mutable2.reverse();
	System.out.println(mutable2);
	mutable2.append(" Akash");
	System.out.println(mutable2);
	
	}	
	
}
