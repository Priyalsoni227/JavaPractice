package practicals;
import java.util.Arrays;

public class String2 {

	public static void main(String[] args) {
		
        String s="anagram";
        String t="nagaram";
        
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        
        if(s.length()==t.length()) {
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	if(Arrays.equals(ch1,ch2))
        		System.out.println("true");
        	else
        		System.out.println("false");
        	
        }
	}

}
