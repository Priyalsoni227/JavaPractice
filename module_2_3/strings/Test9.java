package strings;
import java.util.*;

//getChars

public class Test9 {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("Geeks for Geeks");
		System.out.println("String is: "+str);
        char[] array=new char [15];
        Arrays.fill(array,'.');
        str.getChars(0,9,array,1);
        for(char ch:array) {
        	System.out.print(ch+" ");
        }
        
	}

}
