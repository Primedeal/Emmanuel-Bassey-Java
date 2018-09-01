package Datatypes;

import org.omg.Messaging.SyncScopeHelper;

public class datatypes {
	public static void main(String[] args){
		
		byte b = 127;
		short s = -32768;
		int x = b;
		long l = 123456789098761l;
		
		boolean r = true;
		
		float f = 3.141354546567687979979f;
		double d = 3.1423234567877877766666666665435467787;
		
		char ch = 'A';
		
		System.out.println(b);
		System.out.println(x);
		System.out.println(r);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		
		ch = '\u0775';
		System.out.println(ch);
		
		ch = '\u00B0';
		System.out.println("25" + ch + "c");
		
		
				
		
		
		
		
	}

}
